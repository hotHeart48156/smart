package org.admin.domain.gateway;

import org.admin.domain.customer.Customer;
import org.admin.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
