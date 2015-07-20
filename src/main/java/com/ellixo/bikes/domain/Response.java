package com.ellixo.bikes.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "opendata"
})
public class Response {

    @JsonProperty("opendata")
    private OpenData opendata;

    @JsonProperty("opendata")
    public OpenData getOpendata() {
        return opendata;
    }

    @JsonProperty("opendata")
    public void setOpendata(OpenData opendata) {
        this.opendata = opendata;
    }

}