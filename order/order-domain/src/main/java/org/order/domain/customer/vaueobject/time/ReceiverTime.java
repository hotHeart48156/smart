package org.order.domain.customer.vaueobject.time;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Timestamp;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Embeddable
public class ReceiverTime extends AbstractTime {
    @Column(name = "receiver_time")
    protected Timestamp receiverTime;


}
