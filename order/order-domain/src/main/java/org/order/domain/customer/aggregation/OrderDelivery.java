package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.name.DeliveryCompanyName;
import org.order.domain.customer.vaueobject.sn.DeliverySn;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.time.DeliveryTime;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class OrderDelivery extends JpaAggregate {
    private OrderId orderId;
    private DeliveryCompanyName deliveryCompanyName;
    private DeliverySn deliverySn;
    private DeliveryTime deliveryTime;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
