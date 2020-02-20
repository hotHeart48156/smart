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
public class FinishOverTime extends AbstractTime {
    @Column(name = "finish_over_time")
    protected Timestamp finishOverTime;

}
