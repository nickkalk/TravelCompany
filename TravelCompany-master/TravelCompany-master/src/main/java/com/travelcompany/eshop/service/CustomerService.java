package com.travelcompany.eshop.service;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.exception.CustomerException;

import java.util.List;

/**
 *
 * @author Public
 */
public interface CustomerService {

    /**
     *
     * @param customer
     * @throws CustomerException
     */
    void createCustomer(Customer customer) throws CustomerException;

    /**
     *
     * @param id
     * @return
     * @throws CustomerException
     */
    Customer returnCustomer(Integer id) throws CustomerException;

    /**
     *
     * @return @throws CustomerException
     */
    List<Customer> returnCustomer() throws CustomerException;
}
