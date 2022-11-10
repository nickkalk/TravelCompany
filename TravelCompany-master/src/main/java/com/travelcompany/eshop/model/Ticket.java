package com.travelcompany.eshop.model;

/**
 *
 * @author Public
 */
public class Ticket {

    private int id;
    private int passengerId;
    private int itineraryId;
    private String paymentMethod;
    private int paymentAmount;

    /**
     *
     * @param id
     * @param passengerId
     * @param itineraryId
     * @param paymentMethod
     * @param paymentAmount
     */
    public Ticket(int id, int passengerId, int itineraryId, String paymentMethod, int paymentAmount) {
        this.id = id;
        this.passengerId = passengerId;
        this.itineraryId = itineraryId;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
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
    public int getPassengerId() {
        return passengerId;
    }

    /**
     *
     * @param passengerId
     */
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    /**
     *
     * @return
     */
    public int getItineraryId() {
        return itineraryId;
    }

    /**
     *
     * @param itineraryId
     */
    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    /**
     *
     * @return
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     *
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     *
     * @return
     */
    public int getPaymentAmount() {
        return paymentAmount;
    }

    /**
     *
     * @param paymentAmount
     */
    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " id = " + this.id + " passengerId = " + this.passengerId
                + " itineraryId = " + this.itineraryId + " paymentMethod = " + this.paymentMethod
                + " paymentAmount = " + this.paymentAmount;
    }

}
