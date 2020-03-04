//  This codes are generated automatically. Do not modify!
package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.domain.support.DataOptional;
import io.swagger.annotations.ApiModelProperty;

import java.lang.String;
import java.util.function.Consumer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.vaueobject.id.UserId;
import org.order.domain.customer.vaueobject.sn.OrderSn;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.OrderType;
import org.order.domain.customer.vaueobject.type.SourceType;

@Data
public abstract class BaseOrderQueryUpdater<T extends BaseOrderQueryUpdater> {
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "keyWords"
    )
    private DataOptional<String> keyWords;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderType"
    )
    private DataOptional<OrderType> orderType;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderSn"
    )
    private DataOptional<OrderSn> orderSn;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "createTime"
    )
    private DataOptional<CreateTime> createTime;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "sourceType"
    )
    private DataOptional<SourceType> sourceType;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "orderStatus"
    )
    private DataOptional<OrderStatus> orderStatus;

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    @ApiModelProperty(
            value = "",
            name = "memberId"
    )
    private DataOptional<UserId> memberId;

    public T keyWords(String keyWords) {
        this.keyWords = DataOptional.of(keyWords);
        return (T) this;
    }

    public T acceptKeyWords(Consumer<String> consumer) {
        if (this.keyWords != null) {
            consumer.accept(this.keyWords.getValue());
        }
        return (T) this;
    }

    public T orderType(OrderType orderType) {
        this.orderType = DataOptional.of(orderType);
        return (T) this;
    }

    public T acceptOrderType(Consumer<OrderType> consumer) {
        if (this.orderType != null) {
            consumer.accept(this.orderType.getValue());
        }
        return (T) this;
    }

    public T orderSn(OrderSn orderSn) {
        this.orderSn = DataOptional.of(orderSn);
        return (T) this;
    }

    public T acceptOrderSn(Consumer<OrderSn> consumer) {
        if (this.orderSn != null) {
            consumer.accept(this.orderSn.getValue());
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

    public T sourceType(SourceType sourceType) {
        this.sourceType = DataOptional.of(sourceType);
        return (T) this;
    }

    public T acceptSourceType(Consumer<SourceType> consumer) {
        if (this.sourceType != null) {
            consumer.accept(this.sourceType.getValue());
        }
        return (T) this;
    }

    public T orderStatus(OrderStatus orderStatus) {
        this.orderStatus = DataOptional.of(orderStatus);
        return (T) this;
    }

    public T acceptOrderStatus(Consumer<OrderStatus> consumer) {
        if (this.orderStatus != null) {
            consumer.accept(this.orderStatus.getValue());
        }
        return (T) this;
    }

    public T memberId(UserId memberId) {
        this.memberId = DataOptional.of(memberId);
        return (T) this;
    }

    public T acceptMemberId(Consumer<UserId> consumer) {
        if (this.memberId != null) {
            consumer.accept(this.memberId.getValue());
        }
        return (T) this;
    }

    public void accept(OrderQuery target) {
        this.acceptKeyWords(target::setKeyWords);
        this.acceptOrderType(target::setOrderType);
        this.acceptOrderSn(target::setOrderSn);
        this.acceptCreateTime(target::setCreateTime);
        this.acceptSourceType(target::setSourceType);
        this.acceptOrderStatus(target::setOrderStatus);
        this.acceptMemberId(target::setMemberId);
    }
}
