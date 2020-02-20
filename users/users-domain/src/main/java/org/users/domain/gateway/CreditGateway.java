package org.users.domain.gateway;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
