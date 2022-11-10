package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Public
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();

    /**
     *
     * @param customer
     * @return
     */
    @Override
    public boolean createCustomer(Customer customer) {
        customers.add(customer);
        return true;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Customer readCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null; // If no customer is found
    }

    /**
     *
     * @return
     */
    @Override
    public List<Customer> readCustomer() {
        List<Customer> returnCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            returnCustomers.add(customer);
        }
        return returnCustomers;
    }

    /**
     *
     * @param id
     * @param newAddress
     * @return
     */
    @Override
    public boolean updateCustomer(int id, String newAddress) {
        Customer customer = readCustomer(id);
        if (customer == null) {
            return false;
        }
        customer.setAddress(newAddress);
        return true;
    }

    /**
     *
     * @param id
     * @return
     * @throws CustomerException
     */
    @Override
    public boolean deleteCustomer(int id) throws CustomerException {
        Customer customer = readCustomer(id);
        if (customer == null) {
            throw new CustomerException("Customer not found");
        }
        customers.remove(customer);
        return true;
    }

}
