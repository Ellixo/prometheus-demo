package com.ellixo.bikes.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"number",
"name",
"address",
"state",
"latitude",
"longitude",
"slotsavailable",
"bikesavailable",
"pos",
"district",
"lastupdate"
})
public class Station {

@JsonProperty("number")
private String number;
@JsonProperty("name")
private String name;
@JsonProperty("address")
private String address;
@JsonProperty("state")
private String state;
@JsonProperty("latitude")
private String latitude;
@JsonProperty("longitude")
private String longitude;
@JsonProperty("slotsavailable")
private String slotsavailable;
@JsonProperty("bikesavailable")
private String bikesavailable;
@JsonProperty("pos")
private String pos;
@JsonProperty("district")
private String district;
@JsonProperty("lastupdate")
private String lastupdate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The number
*/
@JsonProperty("number")
public String getNumber() {
return number;
}

/**
* 
* @param number
* The number
*/
@JsonProperty("number")
public void setNumber(String number) {
this.number = number;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The address
*/
@JsonProperty("address")
public String getAddress() {
return address;
}

/**
* 
* @param address
* The address
*/
@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The latitude
*/
@JsonProperty("latitude")
public String getLatitude() {
return latitude;
}

/**
* 
* @param latitude
* The latitude
*/
@JsonProperty("latitude")
public void setLatitude(String latitude) {
this.latitude = latitude;
}

/**
* 
* @return
* The longitude
*/
@JsonProperty("longitude")
public String getLongitude() {
return longitude;
}

/**
* 
* @param longitude
* The longitude
*/
@JsonProperty("longitude")
public void setLongitude(String longitude) {
this.longitude = longitude;
}

/**
* 
* @return
* The slotsavailable
*/
@JsonProperty("slotsavailable")
public String getSlotsavailable() {
return slotsavailable;
}

/**
* 
* @param slotsavailable
* The slotsavailable
*/
@JsonProperty("slotsavailable")
public void setSlotsavailable(String slotsavailable) {
this.slotsavailable = slotsavailable;
}

/**
* 
* @return
* The bikesavailable
*/
@JsonProperty("bikesavailable")
public String getBikesavailable() {
return bikesavailable;
}

/**
* 
* @param bikesavailable
* The bikesavailable
*/
@JsonProperty("bikesavailable")
public void setBikesavailable(String bikesavailable) {
this.bikesavailable = bikesavailable;
}

/**
* 
* @return
* The pos
*/
@JsonProperty("pos")
public String getPos() {
return pos;
}

/**
* 
* @param pos
* The pos
*/
@JsonProperty("pos")
public void setPos(String pos) {
this.pos = pos;
}

/**
* 
* @return
* The district
*/
@JsonProperty("district")
public String getDistrict() {
return district;
}

/**
* 
* @param district
* The district
*/
@JsonProperty("district")
public void setDistrict(String district) {
this.district = district;
}

/**
* 
* @return
* The lastupdate
*/
@JsonProperty("lastupdate")
public String getLastupdate() {
return lastupdate;
}

/**
* 
* @param lastupdate
* The lastupdate
*/
@JsonProperty("lastupdate")
public void setLastupdate(String lastupdate) {
this.lastupdate = lastupdate;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}