package com.mthree.academy.c458.classesandobjects.addressbook.dto;

public class Address {
    private String firstname;
    private String surname;
    private String address;

    public Address() {}
    public Address(String firstname, String surname, String address) {
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
