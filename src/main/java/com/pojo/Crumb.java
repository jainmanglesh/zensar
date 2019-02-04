
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
    "type",
    "displayName",
    "item",
    "clickable"
})
public class Crumb {

    @JsonProperty("type")
    private String type;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("item")
    private String item;
    @JsonProperty("clickable")
    private String clickable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Crumb withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Crumb withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("item")
    public String getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(String item) {
        this.item = item;
    }

    public Crumb withItem(String item) {
        this.item = item;
        return this;
    }

    @JsonProperty("clickable")
    public String getClickable() {
        return clickable;
    }

    @JsonProperty("clickable")
    public void setClickable(String clickable) {
        this.clickable = clickable;
    }

    public Crumb withClickable(String clickable) {
        this.clickable = clickable;
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

    public Crumb withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
