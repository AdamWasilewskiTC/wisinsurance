package com.company;

import java.util.List;

public class Company extends Customer {

    private String nip;
    private String region;
    private String representative;




    public Company(Integer id, String nip, String region, String representative, String email, String phone) {
        super(id, email, phone);
        this.nip = nip;
        this.region = region;
        this.representative = representative;

    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getrepresentative() {
        return representative;
    }

    public void setrepresentative(String representative) {
        this.representative = representative;
    }

}
