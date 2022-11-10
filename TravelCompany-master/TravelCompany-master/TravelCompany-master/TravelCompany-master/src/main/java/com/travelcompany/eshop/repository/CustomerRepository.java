package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.model.Customer;
import java.util.List;

/**
 *
 * @author Public
 */
public interface CustomerRepository {

    /**
     *
     * @param customer
     * @return
     */
    boolean createCustomer(Customer customer);

    /**
     *
     * @param id
     * @return
     */
    Customer readCustomer(int id);

    /**
     *
     * @return
     */
    List<Customer> readCustomer();

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    boolean updateCustomer(int id, String newAddress);

    /**
     *
     * @param id
     * @return
     * @throws CustomerException
     */
    boolean deleteCustomer(int id) throws CustomerException;

}
