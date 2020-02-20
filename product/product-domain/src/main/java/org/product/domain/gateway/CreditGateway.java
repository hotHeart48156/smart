package org.product.domain.gateway;

import org.product.domain.customer.Customer;
import org.product.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
