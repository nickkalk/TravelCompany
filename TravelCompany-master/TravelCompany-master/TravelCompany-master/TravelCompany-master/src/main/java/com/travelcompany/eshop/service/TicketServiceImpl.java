package com.travelcompany.eshop.service;

import com.travelcompany.eshop.exception.TicketException;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.TicketRepository;
import com.travelcompany.eshop.repository.TicketRepositoryImpl;

import java.util.List;

/**
 *
 * @author Public
 */
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository = new TicketRepositoryImpl();

    /**
     *
     */
    public TicketServiceImpl() {
    }

    /**
     *
     * @param ticketRepository
     */
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    /**
     *
     * @param ticket
     * @throws TicketException
     */
    @Override
    public void createTicket(Ticket ticket) throws TicketException {
        ticketRepository.createTicket(ticket);
    }

    /**
     *
     * @param id
     * @return
     * @throws TicketException
     */
    @Override
    public Ticket returnTicket(Integer id) throws TicketException {
        return ticketRepository.readTicket(id);
    }

    /**
     *
     * @return @throws TicketException
     */
    @Override
    public List<Ticket> returnTicket() throws TicketException {
        return ticketRepository.readTicket();
    }
}
