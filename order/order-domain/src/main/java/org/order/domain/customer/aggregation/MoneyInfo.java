package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.customer.vaueobject.fee.DiscountFee;
import org.order.domain.customer.vaueobject.fee.FreightFee;
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
public class MoneyInfo extends JpaAggregate {
    private CreateTime createTime;
    private OrderId orderId;
    private FreightFee freightFee;
    private DiscountFee discountFee;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
