package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.vaueobject.time.CreateTime;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class OrderDetail extends JpaAggregate {
    private CreateTime createTime;
    private List<OrderItem> orderItems;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
