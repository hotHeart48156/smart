package org.order.domain.vaueobject.time;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)

@Embeddable
public class CreateTime extends AbstractTime {
    @Column(name = "create_time")
    private Date createTime = new Date(System.currentTimeMillis());

    public CreateTime() {
    }

    public Date getCreateTime() {
        return createTime;
    }
}
