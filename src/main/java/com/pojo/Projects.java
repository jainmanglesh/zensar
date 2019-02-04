
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
    "products",
    "facets",
    "categoryTitle",
    "childCategoriesCount",
    "seoInformation",
    "results",
    "pagesAvailable",
    "crumbs",
    "dynamicBannerId",
    "seoBannerId",
    "redirectUrl",
    "staticLinks",
    "selectedDept",
    "multiCatSelected",
    "endecaCanonical"
})
public class Projects {

    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();
    @JsonProperty("facets")
    private List<Facet> facets = new ArrayList<Facet>();
    @JsonProperty("categoryTitle")
    private String categoryTitle;
    @JsonProperty("childCategoriesCount")
    private Integer childCategoriesCount;
    @JsonProperty("seoInformation")
    private SeoInformation seoInformation;
    @JsonProperty("results")
    private Integer results;
    @JsonProperty("pagesAvailable")
    private Integer pagesAvailable;
    @JsonProperty("crumbs")
    private List<Crumb> crumbs = new ArrayList<Crumb>();
    @JsonProperty("dynamicBannerId")
    private String dynamicBannerId;
    @JsonProperty("seoBannerId")
    private String seoBannerId;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonProperty("staticLinks")
    private List<Object> staticLinks = new ArrayList<Object>();
    @JsonProperty("selectedDept")
    private String selectedDept;
    @JsonProperty("multiCatSelected")
    private String multiCatSelected;
    @JsonProperty("endecaCanonical")
    private String endecaCanonical;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Projects withProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    @JsonProperty("facets")
    public List<Facet> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public Projects withFacets(List<Facet> facets) {
        this.facets = facets;
        return this;
    }

    @JsonProperty("categoryTitle")
    public String getCategoryTitle() {
        return categoryTitle;
    }

    @JsonProperty("categoryTitle")
    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Projects withCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
        return this;
    }

    @JsonProperty("childCategoriesCount")
    public Integer getChildCategoriesCount() {
        return childCategoriesCount;
    }

    @JsonProperty("childCategoriesCount")
    public void setChildCategoriesCount(Integer childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
    }

    public Projects withChildCategoriesCount(Integer childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
        return this;
    }

    @JsonProperty("seoInformation")
    public SeoInformation getSeoInformation() {
        return seoInformation;
    }

    @JsonProperty("seoInformation")
    public void setSeoInformation(SeoInformation seoInformation) {
        this.seoInformation = seoInformation;
    }

    public Projects withSeoInformation(SeoInformation seoInformation) {
        this.seoInformation = seoInformation;
        return this;
    }

    @JsonProperty("results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Integer results) {
        this.results = results;
    }

    public Projects withResults(Integer results) {
        this.results = results;
        return this;
    }

    @JsonProperty("pagesAvailable")
    public Integer getPagesAvailable() {
        return pagesAvailable;
    }

    @JsonProperty("pagesAvailable")
    public void setPagesAvailable(Integer pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    public Projects withPagesAvailable(Integer pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
        return this;
    }

    @JsonProperty("crumbs")
    public List<Crumb> getCrumbs() {
        return crumbs;
    }

    @JsonProperty("crumbs")
    public void setCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
    }

    public Projects withCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
        return this;
    }

    @JsonProperty("dynamicBannerId")
    public String getDynamicBannerId() {
        return dynamicBannerId;
    }

    @JsonProperty("dynamicBannerId")
    public void setDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
    }

    public Projects withDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
        return this;
    }

    @JsonProperty("seoBannerId")
    public String getSeoBannerId() {
        return seoBannerId;
    }

    @JsonProperty("seoBannerId")
    public void setSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
    }

    public Projects withSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
        return this;
    }

    @JsonProperty("redirectUrl")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public Projects withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    @JsonProperty("staticLinks")
    public List<Object> getStaticLinks() {
        return staticLinks;
    }

    @JsonProperty("staticLinks")
    public void setStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
    }

    public Projects withStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
        return this;
    }

    @JsonProperty("selectedDept")
    public String getSelectedDept() {
        return selectedDept;
    }

    @JsonProperty("selectedDept")
    public void setSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
    }

    public Projects withSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
        return this;
    }

    @JsonProperty("multiCatSelected")
    public String getMultiCatSelected() {
        return multiCatSelected;
    }

    @JsonProperty("multiCatSelected")
    public void setMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
    }

    public Projects withMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
        return this;
    }

    @JsonProperty("endecaCanonical")
    public String getEndecaCanonical() {
        return endecaCanonical;
    }

    @JsonProperty("endecaCanonical")
    public void setEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
    }

    public Projects withEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
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

    public Projects withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
