package com.zensar.rest;

import java.awt.Color;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.ColorSwatch;
import com.pojo.Product;

@RestController
@RequestMapping("/")
@ConfigurationProperties
public class Controller {

	private RestTemplate restTemplate = new RestTemplate();
	private String productURL;

	@Autowired
	private Environment env;

	@GetMapping("/600001506")
	public ResponseEntity<List<Product>> getProductDetails(
			@RequestParam(required = false, value = "labelType") String labelType)
			throws Exception, JsonProcessingException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String response = restTemplate
				.exchange(productURL, org.springframework.http.HttpMethod.GET, entity, String.class).getBody();
		// String json = mapper.writeValueAsString();
		System.out.println("Json response:" + response);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode tree = mapper.readTree(response);
		Iterator<JsonNode> products = tree.path("products").elements();
		List<Product> productList = new ArrayList<Product>();
		for (; products.hasNext();) {
			Product prod = new Product();
			JsonNode node = products.next();
			String productId = node.path("productId").asText();
			prod.setProductId(productId);
			prod.setTitle(node.path("title").asText());
			JsonNode colorSwatch = node.path("colorSwatches");
			populateColorSwatch(prod, colorSwatch);
			JsonNode priceNode = node.path("price");
			populatePrice(labelType, productList, prod, priceNode);

		}

		productList.sort(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {

				return new Double(o2.difference() - o1.difference()).intValue();
			}
		});

		return new ResponseEntity(productList, HttpStatus.ACCEPTED);
	}

	private void populatePrice(String labelType, List<Product> productList, Product prod, JsonNode priceNode) {
		if (priceNode != null && !priceNode.isNull()) {
			if (priceNode.path("now") != null && !priceNode.path("now").asText().isEmpty()) {

				String nowPrice = priceNode.path("now").asText();
				String nowPriceStr = formatPrice(nowPrice);
				String currencyStr = priceNode.path("currency").asText();
				String currency = env.getProperty(currencyStr);
				prod.setNowPrice(currency + nowPriceStr);

				String was = formatPrice(priceNode.path("was").asText());
				String then1 = formatPrice(priceNode.path("then1").asText());
				String then2 = formatPrice(priceNode.path("then2").asText());
				String then = then2 != null && !then2.isEmpty() ? then2 : then1;
				if (labelType != null) {
					if (labelType.equalsIgnoreCase("ShowWasThenNow")) {
						prod.setPriceLabel("Was " + currency + ", then " + currency + then + ", now " + currency
								+ nowPriceStr);
						// Was £x.xx, then £y.yy, now £z.zzz
					} else if (labelType.equalsIgnoreCase("ShowPercDscount")) {
						if (was != null && !was.isEmpty() && nowPriceStr != null && !nowPriceStr.isEmpty()) {
							double now = Double.parseDouble(nowPriceStr);
							double wasD = Double.parseDouble(was);
							double reductionPerc = (-(now - wasD) * 100d) / wasD;
							String reductionStr = formatPrice(String.valueOf(reductionPerc));
							prod.setPriceLabel(reductionStr + "% off - now " + currency + nowPriceStr);
							// x% off - now £y.yy
						}
					} else {
						prod.setPriceLabel("Was " + currency + was + ", now " + currency + nowPriceStr);
						// Was £x.xx, now £y.yyy
					}
				} else {
					prod.setPriceLabel("Was " + currency + was + ", now " + currency + nowPriceStr);
					// Was £x.xx, now £y.yyy
				}
				if (was != null && !was.isEmpty() && nowPriceStr != null && !nowPriceStr.isEmpty()) {
					prod.setWas(Double.parseDouble(was));
					prod.setNow(Double.parseDouble(nowPriceStr));
					if (prod.difference() > 0) {
						productList.add(prod);
					}
				}
			}

		}
	}

	private void populateColorSwatch(Product prod, JsonNode colorSwatch) {
		if (!colorSwatch.isNull()) {
			Iterator<JsonNode> colorSwatchesNodes = colorSwatch.elements();
			List<ColorSwatch> colorSwatchList = new ArrayList<ColorSwatch>();
			while (colorSwatchesNodes != null && colorSwatchesNodes.hasNext()) {
				JsonNode colorSwatchNode = colorSwatchesNodes.next();
				ColorSwatch swatch = new ColorSwatch();
				swatch.setColor(colorSwatchNode.path("color").asText());
				String basicColor = colorSwatchNode.path("basicColor").asText();
				if (basicColor != null && !basicColor.isEmpty()) {
					Color color = null;

					String rgbColor = null;
					try {
						Field field = Color.class.getField(basicColor.toLowerCase());
						color = (Color) field.get(null);
						rgbColor = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(),
								color.getBlue());
					} catch (Exception e) {
						color = null; // Not defined
						if (env.getProperty(basicColor.toUpperCase()) != null) {
							rgbColor = env.getProperty(basicColor.toUpperCase());
						} else {
							System.out.println("**** Not able to fine color : " + basicColor
									+ " in Java Color class and in environemnt properties , please define this color in application.properties");
						}

					}
					// Color color = Color.getColor//stringToColorCustom(basicColor.toUpperCase());
					if (rgbColor != null) {
						System.out.println("Basic color : " + basicColor + " color:" + color);
						swatch.setRgbColor(rgbColor);
					}

				}
				swatch.setSkuId(colorSwatchNode.path("skuId").asText());
				colorSwatchList.add(swatch);
			}

			prod.setColorSwatches(colorSwatchList);

		}
	}

	private String formatPrice(String nowPriceStr) {

		if (nowPriceStr != null && !nowPriceStr.isEmpty()) {
			double nowPrice = Double.parseDouble(nowPriceStr);
			int decimalPlaces = 2;
			BigDecimal bd = new BigDecimal(nowPrice);

			if (nowPrice < 10) {
				bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
			} else {
				bd = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
			}
			return bd.toPlainString();

		}
		return "";
	}

	public String getProductURL() {
		return productURL;
	}

	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}

}
