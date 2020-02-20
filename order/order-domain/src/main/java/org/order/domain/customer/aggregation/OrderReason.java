package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.OrderOperateHistory;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.time.CreateTime;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class OrderReason extends JpaAggregate {
    private OrderId orderId;
    private OrderReason orderReason;
    private OrderOperateHistory orderOperateHistory;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
