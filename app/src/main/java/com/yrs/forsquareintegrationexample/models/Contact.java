package com.yrs.forsquareintegrationexample.models;

/**
 * Created by yaros on 26/02/16.
 */
public class Contact {

    String phone;
    String formattedPhone;
    String twitter;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFormattedPhone() {
        return formattedPhone;
    }

    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", formattedPhone='" + formattedPhone + '\'' +
                ", twitter='" + twitter + '\'' +
                '}';
    }
}
