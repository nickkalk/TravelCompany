package com.technikon.eagency.model;

/**
 *
 * @author Nick
 */
public class Owner extends Person {

    private long vatNumber;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String email;

    public long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(long vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
