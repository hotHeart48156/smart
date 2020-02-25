package org.users.domain.customer.valueobject;

import lombok.Value;

import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@Value
public class BuyMoney {
    private BigDecimal money;
}
