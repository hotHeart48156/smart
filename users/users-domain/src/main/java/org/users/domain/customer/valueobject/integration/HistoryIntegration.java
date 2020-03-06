package org.users.domain.customer.valueobject.integration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.valueobject.id.AbstractIntegration;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Value
public class HistoryIntegration extends AbstractIntegration {
    @Column(name ="   historyIntegration")
private Long integration;
}
