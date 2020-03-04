package org.order.domain.customer.vaueobject;

import lombok.Value;
import org.apache.kafka.common.protocol.types.Field;

import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@Value
public class BillHead implements ValueObject {
    private String billHead;
}
