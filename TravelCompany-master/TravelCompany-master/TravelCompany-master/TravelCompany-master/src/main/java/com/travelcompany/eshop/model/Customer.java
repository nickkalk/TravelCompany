package com.travelcompany.eshop.model;

/**
 *
 * @author Public
 */
public class Customer {

    private int id;
    private String name;
    private String email;
    private String address;
    private String Nationality;
    private String category;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param address
     * @param Nationality
     * @param category
     */
    public Customer(int id, String name, String email, String address, String Nationality, String category) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.Nationality = Nationality;
        this.category = category;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getNationality() {
        return Nationality;
    }

    /**
     *
     * @param Nationality
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " id = " + this.id + " name = " + this.name + " email = " + this.email + " address = " + this.address
                + "nationality = " + this.Nationality + " email = " + this.email;

    }
}
