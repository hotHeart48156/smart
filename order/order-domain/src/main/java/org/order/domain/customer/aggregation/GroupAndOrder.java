package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.OrderType;
import org.order.domain.customer.vaueobject.type.PayType;
import org.order.domain.customer.vaueobject.type.SourceType;

import java.util.Date;

/**
 * @author "yangbiao"
 */

/**
 * 团购订单
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class GroupAndOrder extends JpaAggregate {
    private CreateTime createTime;
    private OrderType orderType;
    private AddressId addressId;
    private PayType payType;
    private SourceType sourceType;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
