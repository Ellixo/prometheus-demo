package com.ellixo.bikes.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "@attributes"
})
public class Status {

    @JsonProperty("@attributes")
    private com.ellixo.bikes.domain.Attributes Attributes;

    @JsonProperty("@attributes")
    public com.ellixo.bikes.domain.Attributes getAttributes() {
        return Attributes;
    }
    
    @JsonProperty("@attributes")
    public void setAttributes(com.ellixo.bikes.domain.Attributes Attributes) {
        this.Attributes = Attributes;
    }

}