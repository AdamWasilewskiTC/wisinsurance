package com.company;

import java.util.List;

public class Person extends Customer{
    private String pesel;
    private String name;
    private String surname;


    public Person(Integer id, String pesel, String name, String surname, String email, String phone) {
        super(id, email, phone);
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

}
