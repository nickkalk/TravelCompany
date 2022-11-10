package com.travelcompany.eshop.service;

import com.travelcompany.eshop.exception.PurchaseException;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.*;

/**
 *
 * @author Public
 */
public class PurchaseServiceImpl implements PurchaseService {

    private final CustomerRepository customerRepository = new CustomerRepositoryImpl();
    private final ItineraryRepository itineraryRepository = new ItineraryRepositoryImpl();
    private final TicketRepository ticketRepository = new TicketRepositoryImpl();

    /**
     *
     * @param passengerId
     * @param itineraryId
     * @param paymentMethod
     * @throws PurchaseException
     */
    @Override
    public void purchase(Integer passengerId, Integer itineraryId, String paymentMethod) throws PurchaseException {
        String passengerType = customerRepository.readCustomer(passengerId).getCategory();
        int basicPrice = itineraryRepository.readItinerary(itineraryId).getBasicPrice();
        int finalPrice;
        int discount = 0;
        if ("Business".equals(passengerType)) {
            discount = 10;
            if ("Credit Card".equals(paymentMethod)) {
                discount = 20;
            }
        }
        if ("Individual".equals(passengerType)) {
            basicPrice = basicPrice + basicPrice / 100 * 20;
            if ("Credit Card".equals(paymentMethod)) {
                discount = 10;
            }
        }
        finalPrice = basicPrice - basicPrice / 100 * discount;
        Ticket ticket = new Ticket(ticketRepository.readTicket().size() + 1, passengerId, itineraryId, paymentMethod, finalPrice);
        ticketRepository.createTicket(ticket);
    }
}
