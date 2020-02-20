//  This codes are generated automatically. Do not modify!
package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.domain.support.DataOptional;
import io.swagger.annotations.ApiModelProperty;

import java.util.function.Consumer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.entity.OrderOperateHistory;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.time.CreateTime;

@Data
public abstract class BaseOrderReasonUpdater<T extends BaseOrderReasonUpdater> {
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderReason"
    )
    private DataOptional<OrderReason> orderReason;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderOperateHistory"
    )
    private DataOptional<OrderOperateHistory> orderOperateHistory;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderId"
    )
    private DataOptional<OrderId> orderId;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "createTime"
    )
    private DataOptional<CreateTime> createTime;

    public T orderReason(OrderReason orderReason) {
        this.orderReason = DataOptional.of(orderReason);
        return (T) this;
    }

    public T acceptOrderReason(Consumer<OrderReason> consumer) {
        if (this.orderReason != null) {
            consumer.accept(this.orderReason.getValue());
        }
        return (T) this;
    }

    public T orderOperateHistory(OrderOperateHistory orderOperateHistory) {
        this.orderOperateHistory = DataOptional.of(orderOperateHistory);
        return (T) this;
    }

    public T acceptOrderOperateHistory(Consumer<OrderOperateHistory> consumer) {
        if (this.orderOperateHistory != null) {
            consumer.accept(this.orderOperateHistory.getValue());
        }
        return (T) this;
    }

    public T orderId(OrderId orderId) {
        this.orderId = DataOptional.of(orderId);
        return (T) this;
    }

    public T acceptOrderId(Consumer<OrderId> consumer) {
        if (this.orderId != null) {
            consumer.accept(this.orderId.getValue());
        }
        return (T) this;
    }

    public T createTime(CreateTime createTime) {
        this.createTime = DataOptional.of(createTime);
        return (T) this;
    }

    public T acceptCreateTime(Consumer<CreateTime> consumer) {
        if (this.createTime != null) {
            consumer.accept(this.createTime.getValue());
        }
        return (T) this;
    }

    public void accept(OrderReason target) {
        this.acceptOrderReason(target::setOrderReason);
        this.acceptOrderOperateHistory(target::setOrderOperateHistory);
        this.acceptOrderId(target::setOrderId);
        this.acceptCreateTime(target::setCreateTime);
    }
}
