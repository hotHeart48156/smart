package org.users.domain.customer.valueobject.integration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class Integration extends AbstractIntegration {
    private Long integration;
}
