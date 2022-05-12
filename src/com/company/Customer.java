package com.company;

import java.util.List;

public abstract class Customer {
    private Integer id;
    private String email;
    private String phone;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer(Integer id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;



    }
}
