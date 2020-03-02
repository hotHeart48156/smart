package com.smart.website.repository;

import com.smart.website.domain.customer.Customer;
import com.smart.website.domain.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId) {
        CustomerDO customerDO = customerMapper.getById(customerId);
        //Convert to Customer
        return null;
    }
}
