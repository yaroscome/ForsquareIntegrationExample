package com.yrs.forsquareintegrationexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yaros on 26/02/16.
 */
public class Response {

    @SerializedName("venues")
    List<Venue> venueList;

    public List<Venue> getVenueList() {
        return venueList;
    }

    public void setVenueList(List<Venue> venueList) {
        this.venueList = venueList;
    }

    @Override
    public String toString() {
        return "Response{" +
                "venueList=" + venueList +
                '}';
    }
}
