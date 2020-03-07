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
public class CommentOverTime extends AbstractTime {
    @Column(name = "comment_over_time")
    private Timestamp commentOverTime;
}
