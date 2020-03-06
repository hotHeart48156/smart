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
@Value
@AllArgsConstructor
public class Integration extends AbstractIntegration {
    @Column(name ="   integration")
private Long integration;
}
