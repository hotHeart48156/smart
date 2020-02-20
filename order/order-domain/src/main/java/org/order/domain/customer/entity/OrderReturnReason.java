package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.id.OrderReturnReasonId;
import org.order.domain.customer.vaueobject.status.ReturnReasonStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.ReturnReasonType;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrderReturnReason extends JpaEntity {
    private OrderId orderId;
    private OrderReturnReasonId id;
    private ReturnReasonStatus returnReasonStatus;
    private CreateTime createTime;
    private ReturnReasonType returnReasonType;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
