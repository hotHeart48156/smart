package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.ContainerManaged;
import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenApplicationMethod;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.OrderOperateHistory;
import org.order.domain.customer.entity.OrderReturnApply;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.springframework.context.ApplicationEventPublisher;

import java.security.interfaces.ECPublicKey;
import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class OrderApply extends JpaAggregate {
    private OrderId orderId;
    private OrderReturnApply orderReturnApply;
    private OrderOperateHistory orderOperateHistory;
    private CreateTime createTime;

    OrderApply(OrderId orderId, OrderReturnApply orderReturnApply, OrderOperateHistory orderOperateHistory) {
        this.orderId = orderId;
        this.orderReturnApply = orderReturnApply;
        this.orderOperateHistory = orderOperateHistory;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public OrderOperateHistory getOrderOperateHistory() {
        return orderOperateHistory;
    }

    public OrderReturnApply getOrderReturnApply() {
        return orderReturnApply;
    }

    @GenApplicationMethod(methodName = "createOrderApply")
    public static OrderApply create(OrderId orderId, OrderReturnApply orderReturnApply, OrderOperateHistory orderOperateHistory) {
        return new OrderApply(orderId, orderReturnApply, orderOperateHistory);
    }

    public void update(OrderApply orderApply, @ContainerManaged ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
