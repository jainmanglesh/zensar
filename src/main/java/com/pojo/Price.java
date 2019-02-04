
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
    "was",
    "then1",
    "then2",
    "now",
    "uom",
    "currency"
})
public class Price {

    @JsonProperty("was")
    private String was;
    @JsonProperty("then1")
    private String then1;
    @JsonProperty("then2")
    private String then2;
    @JsonProperty("now")
    private String now;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("currency")
    private String currency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("was")
    public String getWas() {
        return was;
    }

    @JsonProperty("was")
    public void setWas(String was) {
        this.was = was;
    }

    public Price withWas(String was) {
        this.was = was;
        return this;
    }

    @JsonProperty("then1")
    public String getThen1() {
        return then1;
    }

    @JsonProperty("then1")
    public void setThen1(String then1) {
        this.then1 = then1;
    }

    public Price withThen1(String then1) {
        this.then1 = then1;
        return this;
    }

    @JsonProperty("then2")
    public String getThen2() {
        return then2;
    }

    @JsonProperty("then2")
    public void setThen2(String then2) {
        this.then2 = then2;
    }

    public Price withThen2(String then2) {
        this.then2 = then2;
        return this;
    }

    @JsonProperty("now")
    public String getNow() {
        return now;
    }

    @JsonProperty("now")
    public void setNow(String now) {
        this.now = now;
    }

    public Price withNow(String now) {
        this.now = now;
        return this;
    }

    @JsonProperty("uom")
    public String getUom() {
        return uom;
    }

    @JsonProperty("uom")
    public void setUom(String uom) {
        this.uom = uom;
    }

    public Price withUom(String uom) {
        this.uom = uom;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Price withCurrency(String currency) {
        this.currency = currency;
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

    public Price withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
