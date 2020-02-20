package org.order.domain.customer.vaueobject;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Value
@EqualsAndHashCode
@Embeddable
public class Reason implements ValueObject {
    @Column(name = "reason")
    private String reason;

}
