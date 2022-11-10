package com.travelcompany.eshop.service;

import com.travelcompany.eshop.exception.ItineraryException;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.repository.ItineraryRepository;
import com.travelcompany.eshop.repository.ItineraryRepositoryImpl;

import java.util.List;

/**
 *
 * @author Public
 */
public class ItineraryServiceImpl implements ItineraryService {

    private ItineraryRepository itineraryRepository = new ItineraryRepositoryImpl();

    /**
     *
     */
    public ItineraryServiceImpl() {
    }

    /**
     *
     * @param itineraryRepository
     */
    public ItineraryServiceImpl(ItineraryRepository itineraryRepository) {
        this.itineraryRepository = itineraryRepository;
    }

    /**
     *
     * @param itinerary
     * @throws ItineraryException
     */
    @Override
    public void createItinerary(Itinerary itinerary) throws ItineraryException {
        itineraryRepository.createItinerary(itinerary);
    }

    /**
     *
     * @param id
     * @return
     * @throws ItineraryException
     */
    @Override
    public Itinerary returnItinerary(Integer id) throws ItineraryException {
        return itineraryRepository.readItinerary(id);
    }

    /**
     *
     * @return @throws ItineraryException
     */
    @Override
    public List<Itinerary> returnItinerary() throws ItineraryException {
        return itineraryRepository.readItinerary();
    }
}
