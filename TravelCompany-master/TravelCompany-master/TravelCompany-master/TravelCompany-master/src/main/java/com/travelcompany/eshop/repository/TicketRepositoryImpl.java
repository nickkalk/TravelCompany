package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.TicketException;

import com.travelcompany.eshop.model.Ticket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Public
 */
public class TicketRepositoryImpl implements TicketRepository {

    private final List<Ticket> tickets = new ArrayList<>();

    /**
     *
     * @param ticket
     * @return
     */
    @Override
    public boolean createTicket(Ticket ticket) {
        //TO DO
        tickets.add(ticket);
        return true;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Ticket readTicket(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null; // If no ticket is found
    }

    /**
     *
     * @return
     */
    @Override
    public List<Ticket> readTicket() {
        List<Ticket> returnTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            returnTickets.add(ticket);
        }
        return returnTickets;
    }

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    @Override
    public boolean updateTicket(int id, String newAddress) {

        Ticket ticket = readTicket(id);
        if (ticket == null) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param id
     * @return
     * @throws TicketException
     */
    @Override
    public boolean deleteTicket(int id) throws TicketException {
        Ticket ticket = readTicket(id);
        if (ticket == null) {
            throw new TicketException("Ticket not found");
        }
        tickets.remove(ticket);
        return true;
    }

}
