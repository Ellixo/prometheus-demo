package com.ellixo.bikes.domain;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "status",
        "data"
})
public class Answer {

    @JsonProperty("status")
    private Status status;
    @JsonProperty("data")
    private Data data;

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }
    
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }
    
    @JsonProperty("data")
    public Data getData() {
        return data;
    }
    
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

}