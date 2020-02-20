package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.CartItem;
import org.order.domain.customer.entity.Order;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.vaueobject.MarketScope;
import org.order.domain.customer.vaueobject.Rule;
import org.order.domain.customer.vaueobject.code.PostCode;
import org.order.domain.customer.vaueobject.fee.TotalFee;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.type.OrderType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

/**
 * 营销相关
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class Market extends JpaAggregate {


    private List<CartItem> cartItems;
    private List<OrderItem> orderItems;
    private OrderType orderType;
    private PostCode postCode;
    private RuleId ruleId;
    private Rule rule;
    private MemberId memberId;
    private MarketId marketId;
    private MemberCouponId memberCouponId;
    private TotalFee totalFee;
    private OpenId openId;
    private MarketScope marketScope;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
