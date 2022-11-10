package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.TicketException;
import com.travelcompany.eshop.model.Ticket;
import java.util.List;

/**
 *
 * @author Public
 */
public interface TicketRepository {

    /**
     *
     * @param ticket
     * @return
     */
    boolean createTicket(Ticket ticket);

    /**
     *
     * @param id
     * @return
     */
    Ticket readTicket(int id);

    /**
     *
     * @return
     */
    List<Ticket> readTicket();

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    boolean updateTicket(int id, String newAddress);

    /**
     *
     * @param id
     * @return
     * @throws TicketException
     */
    boolean deleteTicket(int id) throws TicketException;

}
