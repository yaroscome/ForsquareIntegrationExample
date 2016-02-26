package com.yrs.forsquareintegrationexample.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yaros on 26/02/16.
 */
public class Location {

    String address;
    String crossStreet;

    @SerializedName("lat")
    Float latitude;

    @SerializedName("lng")
    Float longitude;
    String postalCode;
    String city;
    String country;

    /*
        --- EXCLUDED ---
        "cc":"US",
        "state":"NY",
        "formattedAddress":[
        "119 Sullivan St (btwn Prince & Spring St)",
        "New York, NY 10012",
        "United States"
        ]
    */

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCrossStreet() {
        return crossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                ", crossStreet='" + crossStreet + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
