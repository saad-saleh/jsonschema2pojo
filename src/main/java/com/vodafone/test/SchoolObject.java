
package com.vodafone.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * SchoolObject
 * <p>
 * This is sample school object described in JSON schema and references other objects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "classes"
})
public class SchoolObject {

    @JsonProperty("_links")
    private List<Link> links = new ArrayList<Link>();
    /**
     * The set of classes under school.
     * 
     */
    @JsonProperty("classes")
    @JsonPropertyDescription("The set of classes under school.")
    private List<Class> classes = new ArrayList<Class>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * The set of classes under school.
     * 
     */
    @JsonProperty("classes")
    public List<Class> getClasses() {
        return classes;
    }

    /**
     * The set of classes under school.
     * 
     */
    @JsonProperty("classes")
    public void setClasses(List<Class> classes) {
        this.classes = classes;
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
        return new ToStringBuilder(this).append("links", links).append("classes", classes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(links).append(additionalProperties).append(classes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchoolObject) == false) {
            return false;
        }
        SchoolObject rhs = ((SchoolObject) other);
        return new EqualsBuilder().append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(classes, rhs.classes).isEquals();
    }

}
