package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;
import java.util.List;

/**
 *
 * @author Public
 */
public interface ItineraryRepository {

    /**
     *
     * @param itinerary
     * @return
     */
    boolean createItinerary(Itinerary itinerary);

    /**
     *
     * @param id
     * @return
     */
    Itinerary readItinerary(int id);

    /**
     *
     * @return
     */
    List<Itinerary> readItinerary();

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    boolean updateItinerary(int id, String newAddress);

    /**
     *
     * @param id
     * @return
     * @throws ItineraryException
     */
    boolean deleteItinerary(int id) throws ItineraryException;

}
