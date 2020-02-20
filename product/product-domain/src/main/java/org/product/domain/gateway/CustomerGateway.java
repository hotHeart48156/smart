package org.product.domain.gateway;

import org.product.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
