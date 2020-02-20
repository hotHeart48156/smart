package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.Order;
import org.order.domain.customer.vaueobject.id.MemberId;
import org.order.domain.customer.vaueobject.sn.OrderSn;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.OrderType;
import org.order.domain.customer.vaueobject.type.SourceType;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class OrderQuery extends JpaAggregate {
    private OrderSn orderSn;
    private MemberId memberId;
    private CreateTime createTime;
    private String keyWords;
    private OrderStatus orderStatus;
    private OrderType orderType;
    private SourceType sourceType;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
