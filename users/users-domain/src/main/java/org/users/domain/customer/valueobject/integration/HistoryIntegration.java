package org.users.domain.customer.valueobject.integration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
public class HistoryIntegration extends AbstractIntegration {
    private Long integration;
}
