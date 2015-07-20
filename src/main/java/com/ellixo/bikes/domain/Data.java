package com.ellixo.bikes.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "station"
})
public class Data {

    @JsonProperty("station")
    private List<Station> stations = new ArrayList<Station>();

    @JsonProperty("station")
    public List<Station> getStations() {
        return stations;
    }

    @JsonProperty("station")
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

}