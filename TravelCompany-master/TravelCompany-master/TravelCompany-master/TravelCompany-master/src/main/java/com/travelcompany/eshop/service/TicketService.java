package com.travelcompany.eshop.service;

import com.travelcompany.eshop.exception.TicketException;
import com.travelcompany.eshop.model.Ticket;

import java.util.List;

/**
 *
 * @author Public
 */
public interface TicketService {

    /**
     *
     * @param ticket
     * @throws TicketException
     */
    void createTicket(Ticket ticket) throws TicketException;

    /**
     *
     * @param id
     * @return
     * @throws TicketException
     */
    Ticket returnTicket(Integer id) throws TicketException;

    /**
     *
     * @return @throws TicketException
     */
    List<Ticket> returnTicket() throws TicketException;
}
