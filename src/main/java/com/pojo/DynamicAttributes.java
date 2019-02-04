
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
    "newinproducttype",
    "washinginstructions",
    "dressbyoccasion",
    "dressshape",
    "typeofpattern",
    "luxuryfabric",
    "fabric",
    "typeofknit",
    "countryoforigin",
    "dryinginstructions"
})
public class DynamicAttributes {

    @JsonProperty("newinproducttype")
    private String newinproducttype;
    @JsonProperty("washinginstructions")
    private String washinginstructions;
    @JsonProperty("dressbyoccasion")
    private String dressbyoccasion;
    @JsonProperty("dressshape")
    private String dressshape;
    @JsonProperty("typeofpattern")
    private String typeofpattern;
    @JsonProperty("luxuryfabric")
    private String luxuryfabric;
    @JsonProperty("fabric")
    private String fabric;
    @JsonProperty("typeofknit")
    private String typeofknit;
    @JsonProperty("countryoforigin")
    private String countryoforigin;
    @JsonProperty("dryinginstructions")
    private String dryinginstructions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("newinproducttype")
    public String getNewinproducttype() {
        return newinproducttype;
    }

    @JsonProperty("newinproducttype")
    public void setNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
    }

    public DynamicAttributes withNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
        return this;
    }

    @JsonProperty("washinginstructions")
    public String getWashinginstructions() {
        return washinginstructions;
    }

    @JsonProperty("washinginstructions")
    public void setWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
    }

    public DynamicAttributes withWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
        return this;
    }

    @JsonProperty("dressbyoccasion")
    public String getDressbyoccasion() {
        return dressbyoccasion;
    }

    @JsonProperty("dressbyoccasion")
    public void setDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
    }

    public DynamicAttributes withDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
        return this;
    }

    @JsonProperty("dressshape")
    public String getDressshape() {
        return dressshape;
    }

    @JsonProperty("dressshape")
    public void setDressshape(String dressshape) {
        this.dressshape = dressshape;
    }

    public DynamicAttributes withDressshape(String dressshape) {
        this.dressshape = dressshape;
        return this;
    }

    @JsonProperty("typeofpattern")
    public String getTypeofpattern() {
        return typeofpattern;
    }

    @JsonProperty("typeofpattern")
    public void setTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
    }

    public DynamicAttributes withTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
        return this;
    }

    @JsonProperty("luxuryfabric")
    public String getLuxuryfabric() {
        return luxuryfabric;
    }

    @JsonProperty("luxuryfabric")
    public void setLuxuryfabric(String luxuryfabric) {
        this.luxuryfabric = luxuryfabric;
    }

    public DynamicAttributes withLuxuryfabric(String luxuryfabric) {
        this.luxuryfabric = luxuryfabric;
        return this;
    }

    @JsonProperty("fabric")
    public String getFabric() {
        return fabric;
    }

    @JsonProperty("fabric")
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public DynamicAttributes withFabric(String fabric) {
        this.fabric = fabric;
        return this;
    }

    @JsonProperty("typeofknit")
    public String getTypeofknit() {
        return typeofknit;
    }

    @JsonProperty("typeofknit")
    public void setTypeofknit(String typeofknit) {
        this.typeofknit = typeofknit;
    }

    public DynamicAttributes withTypeofknit(String typeofknit) {
        this.typeofknit = typeofknit;
        return this;
    }

    @JsonProperty("countryoforigin")
    public String getCountryoforigin() {
        return countryoforigin;
    }

    @JsonProperty("countryoforigin")
    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public DynamicAttributes withCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
        return this;
    }

    @JsonProperty("dryinginstructions")
    public String getDryinginstructions() {
        return dryinginstructions;
    }

    @JsonProperty("dryinginstructions")
    public void setDryinginstructions(String dryinginstructions) {
        this.dryinginstructions = dryinginstructions;
    }

    public DynamicAttributes withDryinginstructions(String dryinginstructions) {
        this.dryinginstructions = dryinginstructions;
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

    public DynamicAttributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
