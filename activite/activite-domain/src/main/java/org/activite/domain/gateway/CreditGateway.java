package org.activite.domain.gateway;

import org.activite.domain.customer.Customer;
import org.activite.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
