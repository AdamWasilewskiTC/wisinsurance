package com.company;

public class Address {
    private Integer id;
    private String city;
    private String street;
    private String homeNumber;
    private String zipcode;

    public Address(Integer id, String city, String street, String homeNumber, String zipcode) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.zipcode = zipcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
