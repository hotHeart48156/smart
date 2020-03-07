package org.order.domain.vaueobject;

import lombok.Value;

import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Value
public class BillHead implements ValueObject {
    private String billHead;
}
