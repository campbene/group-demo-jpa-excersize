package com.example.groupDemoJpaExcersize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String addressLine1;
    private String addressLine2;
    private String apartmentNum;
    private String city;
    private String state;
    private String zipCode;
    private String zipPlusFour;
    private String county;
    private String country;

    protected Address(){}

    public Address(String addressLine1, String addressLine2, String apartmentNum, String city, String state, String zipCode, String zipPlusFour, String county, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipPlusFour = zipPlusFour;
        this.county = county;
        this.country = country;
    }

    public Long getAddressId() {
        return addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipPlusFour() {
        return zipPlusFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

}
