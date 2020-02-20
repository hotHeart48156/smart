package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.Note;
import org.order.domain.customer.vaueobject.OperateMan;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.id.OrderOperateHistoryId;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;

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
public class OrderOperateHistory extends JpaEntity {
    private OrderOperateHistoryId orderOperateHistoryId;
    private OrderId orderId;
    private OperateMan operateMan;
    private CreateTime createTime;
    private OrderStatus orderStatus;
    private Note note;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
