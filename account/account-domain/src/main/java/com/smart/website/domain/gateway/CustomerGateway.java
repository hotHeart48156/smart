package com.smart.website.domain.gateway;

import com.smart.website.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
