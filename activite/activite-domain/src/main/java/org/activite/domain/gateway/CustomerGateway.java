package org.activite.domain.gateway;

import org.activite.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
