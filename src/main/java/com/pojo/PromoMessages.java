
package com.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "priceMatched",
    "offer",
    "customPromotionalMessage",
    "bundleHeadline",
    "customSpecialOffer"
})
public class PromoMessages {

    @JsonProperty("priceMatched")
    private String priceMatched;
    @JsonProperty("offer")
    private String offer;
    @JsonProperty("customPromotionalMessage")
    private String customPromotionalMessage;
    @JsonProperty("bundleHeadline")
    private String bundleHeadline;
    @JsonProperty("customSpecialOffer")
    private CustomSpecialOffer customSpecialOffer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("priceMatched")
    public String getPriceMatched() {
        return priceMatched;
    }

    @JsonProperty("priceMatched")
    public void setPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
    }

    public PromoMessages withPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
        return this;
    }

    @JsonProperty("offer")
    public String getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(String offer) {
        this.offer = offer;
    }

    public PromoMessages withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    @JsonProperty("customPromotionalMessage")
    public String getCustomPromotionalMessage() {
        return customPromotionalMessage;
    }

    @JsonProperty("customPromotionalMessage")
    public void setCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
    }

    public PromoMessages withCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
        return this;
    }

    @JsonProperty("bundleHeadline")
    public String getBundleHeadline() {
        return bundleHeadline;
    }

    @JsonProperty("bundleHeadline")
    public void setBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
    }

    public PromoMessages withBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
        return this;
    }

    @JsonProperty("customSpecialOffer")
    public CustomSpecialOffer getCustomSpecialOffer() {
        return customSpecialOffer;
    }

    @JsonProperty("customSpecialOffer")
    public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOffer) {
        this.customSpecialOffer = customSpecialOffer;
    }

    public PromoMessages withCustomSpecialOffer(CustomSpecialOffer customSpecialOffer) {
        this.customSpecialOffer = customSpecialOffer;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PromoMessages withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
