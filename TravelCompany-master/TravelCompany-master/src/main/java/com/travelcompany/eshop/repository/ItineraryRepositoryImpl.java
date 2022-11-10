package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Public
 */
public class ItineraryRepositoryImpl implements ItineraryRepository {

    private final List<Itinerary> itineraries = new ArrayList<>();

    /**
     *
     * @param itinerary
     * @return
     */
    @Override
    public boolean createItinerary(Itinerary itinerary) {
        // TO DO *****
        itineraries.add(itinerary);
        return false;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Itinerary readItinerary(int id) {
        for (Itinerary itinerary : itineraries) {
            if (itinerary.getId() == id) {
                return itinerary;
            }
        }
        return null; // If no itinerary is found
    }

    /**
     *
     * @return
     */
    @Override
    public List<Itinerary> readItinerary() {
        List<Itinerary> returnItineraries = new ArrayList<>();
        for (Itinerary itinerary : itineraries) {
            returnItineraries.add(itinerary);
        }
        return returnItineraries;
    }

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    @Override
    public boolean updateItinerary(int id, String newAddress) {
        Itinerary itinerary = readItinerary(id);
        if (itinerary == null) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param id
     * @return
     * @throws ItineraryException
     */
    @Override
    public boolean deleteItinerary(int id) throws ItineraryException {
        Itinerary itinerary = readItinerary(id);
        if (itinerary == null) {
            throw new ItineraryException("Itinerary not found");
        }
        itineraries.remove(itinerary);
        return true;
    }
}
