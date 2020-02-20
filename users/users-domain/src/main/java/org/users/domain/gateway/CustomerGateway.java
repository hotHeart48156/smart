package org.users.domain.gateway;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
