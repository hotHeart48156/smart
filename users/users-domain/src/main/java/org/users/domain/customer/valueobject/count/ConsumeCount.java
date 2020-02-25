package org.users.domain.customer.valueobject.count;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class ConsumeCount extends AbstractCount {
    private BigDecimal count;

}
