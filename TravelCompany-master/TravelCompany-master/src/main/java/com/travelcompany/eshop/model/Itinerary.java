package com.travelcompany.eshop.model;

/**
 *
 * @author Public
 */
public class Itinerary {

    private int id;
    private String departureAirportCode;
    private String destinationAirportCode;
    private String departureDate;
    private String airline;
    private int basicPrice;

    /**
     *
     * @param id
     * @param departureAirportCode
     * @param destinationAirportCode
     * @param departureDate
     * @param airline
     * @param basicPrice
     */
    public Itinerary(int id, String departureAirportCode, String destinationAirportCode, String departureDate, String airline, int basicPrice) {
        this.id = id;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
        this.departureDate = departureDate;
        this.airline = airline;
        this.basicPrice = basicPrice;
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
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    /**
     *
     * @param departureAirportCode
     */
    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    /**
     *
     * @return
     */
    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    /**
     *
     * @param destinationAirportCode
     */
    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    /**
     *
     * @return
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     *
     * @param departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     *
     * @return
     */
    public String getAirline() {
        return airline;
    }

    /**
     *
     * @param airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     *
     * @return
     */
    public int getBasicPrice() {
        return basicPrice;
    }

    /**
     *
     * @param basicPrice
     */
    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " id = " + this.id + " departureAirportCode = " + this.departureAirportCode
                + " destinationAirportCode = " + this.destinationAirportCode + " departureDate = " + this.departureDate
                + " airline = " + this.airline + " basicPrice = " + this.basicPrice;
    }
}
