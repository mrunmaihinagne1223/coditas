package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address{
    private String country;
    private String state;
    private int pincode;

    public Address() {
    }

    public Address(String country, String state, int pincode) {
        this.country = country;
        this.state = state;
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
