
package com.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dimensionName",
    "name",
    "type",
    "tooltip",
    "details"
})
public class Facet {

    @JsonProperty("dimensionName")
    private String dimensionName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tooltip")
    private String tooltip;
    @JsonProperty("details")
    private List<Detail> details = new ArrayList<Detail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dimensionName")
    public String getDimensionName() {
        return dimensionName;
    }

    @JsonProperty("dimensionName")
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public Facet withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Facet withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Facet withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("tooltip")
    public String getTooltip() {
        return tooltip;
    }

    @JsonProperty("tooltip")
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Facet withTooltip(String tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    @JsonProperty("details")
    public List<Detail> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Facet withDetails(List<Detail> details) {
        this.details = details;
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

    public Facet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
