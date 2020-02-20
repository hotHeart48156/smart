package org.admin.domain.gateway;

import org.admin.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
