package org.order.domain.vaueobject.time;

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
public class NormalOrderOverTime extends AbstractTime {
    @Column(name = "normal_order_over_time")
    protected Timestamp normalOrderOverTime;

}
