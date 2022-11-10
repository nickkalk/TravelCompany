package com.travelcompany.eshop.service;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.CustomerRepositoryImpl;
import com.travelcompany.eshop.exception.CustomerException;

import java.util.List;

/**
 *
 * @author Public
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    /**
     *
     */
    public CustomerServiceImpl() {
    }

    /**
     *
     * @param customerRepository
     */
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     *
     * @param customer
     * @throws CustomerException
     */
    @Override
    public void createCustomer(Customer customer) throws CustomerException {
        if ("<whatever>@travelcompany.com".equals(customer.getEmail())) {
            throw new CustomerException("Please select another email address");
        } else {
            customerRepository.createCustomer(customer);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Customer returnCustomer(Integer id) {
        return customerRepository.readCustomer(id);

    }

    /**
     *
     * @return
     */
    @Override
    public List<Customer> returnCustomer() {
        return customerRepository.readCustomer();
    }

}
