
package com.vodafone.test.files;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Link
 * <p>
 * The Link component, holds the structure for the links
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "_embedded"
})
public class Links {

    /**
     * HAL Links
     * <p>
     * Object of links with the rels as the keys
     * 
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("Object of links with the rels as the keys")
    private Links_ links;
    /**
     * HAL Embedded Resource
     * <p>
     * An embedded HAL resource
     * 
     */
    @JsonProperty("_embedded")
    @JsonPropertyDescription("An embedded HAL resource")
    private Embedded embedded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * HAL Links
     * <p>
     * Object of links with the rels as the keys
     * 
     */
    @JsonProperty("_links")
    public Links_ getLinks() {
        return links;
    }

    /**
     * HAL Links
     * <p>
     * Object of links with the rels as the keys
     * 
     */
    @JsonProperty("_links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    /**
     * HAL Embedded Resource
     * <p>
     * An embedded HAL resource
     * 
     */
    @JsonProperty("_embedded")
    public Embedded getEmbedded() {
        return embedded;
    }

    /**
     * HAL Embedded Resource
     * <p>
     * An embedded HAL resource
     * 
     */
    @JsonProperty("_embedded")
    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("links", links).append("embedded", embedded).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(links).append(additionalProperties).append(embedded).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return new EqualsBuilder().append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(embedded, rhs.embedded).isEquals();
    }

}
