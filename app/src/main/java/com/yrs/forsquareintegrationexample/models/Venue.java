package com.yrs.forsquareintegrationexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yaros on 26/02/16.
 */
public class Venue {

    String id;
    String name;
    Contact contact;
    Location location;

    @SerializedName("categories")
    List<Category> categoryList;


    /*
        --- EXCLUDED ---
        "verified":true,
        "stats":{  },
        "url":"http:\/\/www.blueribbonrestaurants.com",
        "hasMenu":true,
        "menu":{  },
        "allowMenuUrlEdit":true,
        "specials":{  },
        "hereNow":{  },
        "referralId":"v-1456318012",
        "venueChains":[  ]
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", categoryList=" + categoryList +
                '}';
    }
}
