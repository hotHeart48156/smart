package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.CartItem;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.vaueobject.PromoteInfo;
import org.order.domain.customer.vaueobject.fee.ReduceFee;
import org.order.domain.customer.vaueobject.fee.TotalFee;
import org.order.domain.customer.vaueobject.id.MemberCouponId;
import org.order.domain.customer.vaueobject.id.MarketId;
import org.order.domain.customer.vaueobject.id.MemberId;
import org.order.domain.customer.vaueobject.id.OpenId;
import org.order.domain.customer.vaueobject.type.OrderType;

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
/**
 * 购物车中促销信息的封装
 */
public class CartPromotionItem extends JpaAggregate {
    private List<CartItem> cartItems;
    private List<OrderItem> orderItems;
    private OrderType orderType;
    private MemberId memberId;
    private MarketId marketId;
    private MemberCouponId marketCouponId;
    private TotalFee totalFee;
    private OpenId openId;
    private PromoteInfo promoteInfo;
    private ReduceFee reduceFee;
    private Date Date;

    @Override
    public java.util.Date getCreateTime() {
        return this.getCreateTime();
    }
}
