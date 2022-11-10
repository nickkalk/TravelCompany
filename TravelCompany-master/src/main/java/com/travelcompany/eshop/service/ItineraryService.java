package com.travelcompany.eshop.service;

import com.travelcompany.eshop.exception.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;
import java.util.List;

/**
 *
 * @author Public
 */
public interface ItineraryService {

    /**
     *
     * @param itinerary
     * @throws ItineraryException
     */
    void createItinerary(Itinerary itinerary) throws ItineraryException;

    /**
     *
     * @param id
     * @return
     * @throws ItineraryException
     */
    Itinerary returnItinerary(Integer id) throws ItineraryException;

    /**
     *
     * @return @throws ItineraryException
     */
    List<Itinerary> returnItinerary() throws ItineraryException;
}
