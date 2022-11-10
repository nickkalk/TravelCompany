package com.travelcompany.eshop;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.exception.ItineraryException;
import com.travelcompany.eshop.exception.TicketException;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.service.*;

/**
 *
 * @author Public
 */
public class TravelCompany {

    /**
     *
     * @param args
     * @throws CustomerException
     * @throws ItineraryException
     * @throws TicketException
     */
    public static void main(String[] args) throws CustomerException, ItineraryException, TicketException {

        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketService ticketService = new TicketServiceImpl();

        customerService.createCustomer(new Customer(1, "Maria Iordanou", "miordanou@mail.com", "Athens", "Greek", "Individual"));
        customerService.createCustomer(new Customer(2, "Dimitriou Dimitrios", "ddmitriou@gmail", "Athens", "Greek", "Individual"));
        customerService.createCustomer(new Customer(3, "Ioannis Ioannou", "iioannou@mail.com", "Athens", "Greek", "Business"));
        customerService.createCustomer(new Customer(4, "Antonio Molinari", "amolinari@mail.com", "Milan", "Italian", "Individual"));
        customerService.createCustomer(new Customer(5, "Frederico Rossi", "frossi@mail.com", "Milan", "Italian", "Individual"));
        customerService.createCustomer(new Customer(6, "Mario Conti", "mconti@mail.com", "Rome", "Italian", "Business"));
        customerService.createCustomer(new Customer(7, "Nathan Martin", "nmartin@mail.com", "Lyon", "French", "Business"));
        customerService.createCustomer(new Customer(8, "Enzo Collin", "ecollin@mail.com", "Lyon", "French", "Individual"));
        customerService.createCustomer(new Customer(9, "Frederic Michel", "fmichel@mail.com", "Athens", "French", "Individual"));

        itineraryService.createItinerary(new Itinerary(1, "ATH", "PAR,", "22/02/2022 13:35 ", "SkyLines", 300));
        itineraryService.createItinerary(new Itinerary(2, "ATH", "LON,", "22/02/2022 13:40 ", "SkyLines", 420));
        itineraryService.createItinerary(new Itinerary(3, "ATH", "AMS,", "22/02/2022 13:45 ", "SkyLines", 280));
        itineraryService.createItinerary(new Itinerary(4, "ATH", "PAR,", "22/02/2022 14:20 ", "SkyLines", 310));
        itineraryService.createItinerary(new Itinerary(5, "ATH", "DUB,", "22/02/2022 14:35 ", "SkyLines", 880));
        itineraryService.createItinerary(new Itinerary(6, "ATH", "FRA,", "22/02/2022 14:55 ", "SkyLines", 380));
        itineraryService.createItinerary(new Itinerary(7, "ATH", "FRA,", "22/02/2022 15:35 ", "SkyLines", 350));
        itineraryService.createItinerary(new Itinerary(8, "ATH", "MEX,", "22/02/2022 16:00", "SkyLines", 1020));
        itineraryService.createItinerary(new Itinerary(9, "ATH", "DUB,", "22/02/2022 16:35", "SkyLines", 770));

        ticketService.createTicket(new Ticket(1, 1, 2, "Cash", 0));
        ticketService.createTicket(new Ticket(2, 2, 3, "Cash", 0));
        ticketService.createTicket(new Ticket(3, 3, 3, "Credit Card", 0));
        ticketService.createTicket(new Ticket(4, 2, 4, "Credit Card", 0));
        ticketService.createTicket(new Ticket(5, 3, 4, "Cash", 0));
        ticketService.createTicket(new Ticket(6, 4, 7, "Credit Card", 0));
        ticketService.createTicket(new Ticket(7, 5, 7, "Credit Card", 0));
        ticketService.createTicket(new Ticket(8, 2, 10, "Cash", 0));
        ticketService.createTicket(new Ticket(9, 1, 3, "Cash", 0));
        System.out.println(customerService.returnCustomer() + "\n");
        System.out.println(itineraryService.returnItinerary() + "\n");
        System.out.println(ticketService.returnTicket() + "\n");
        int totalAmount = 0;
        int ticketsNumber = ticketService.returnTicket().size();
        for (Ticket ticket : ticketService.returnTicket()) {
            totalAmount += ticket.getPaymentAmount();
        }
        System.out.println("The total number of tickets is " + ticketsNumber + " and the cost is " + totalAmount + "\n");
        System.out.println("The total number of offered itineraries is " + itineraryService.returnItinerary().size());

    }
}
