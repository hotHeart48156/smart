package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.customer.entity.CartItem;
import org.order.domain.customer.vaueobject.UseIntegration;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.id.CouponId;
import org.order.domain.customer.vaueobject.id.ProductId;
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
public class ConfirmOrderResult extends JpaAggregate {
    private AddressId addressId;
    List<CartItem> cartItems;
    List<CouponId> couponIds;
    private UseIntegration useIntegration;
    private ProductId productId;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
