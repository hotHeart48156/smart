package org.order.domain.customer.vo;


import lombok.Data;
import org.order.domain.customer.entity.CartItem;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.vaueobject.Rule;
import org.order.domain.customer.vaueobject.code.PostCode;
import org.order.domain.customer.vaueobject.fee.TotalFee;
import org.order.domain.customer.vaueobject.id.MarketId;
import org.order.domain.customer.vaueobject.id.MemberCouponId;
import org.order.domain.customer.vaueobject.id.UserId;
import org.order.domain.customer.vaueobject.id.OpenId;
import org.order.domain.customer.vaueobject.type.OrderType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * @Auther: shenzhuan
 * @Date: 2019/6/1 13:54
 * @Description:
 */
@Data
public class CartMarkingVo implements Serializable {
    private List<CartItem> cartList;
    private List<OrderItem> shopOrderGoodsList;
    /**
     * 首购礼
     * 类型1 第一单获取 2 所有订单获取
     */
    private int type;
    /**
     * 新人券 1首次进入 2首次下单 3 首次支付
     * 满额发券 1 订单完成 2 支付完成
     * g购物发券  1 订单完成 2 支付完成
     * 手工改发券  1 订单完成 2 支付完成
     */
    private int scope;
    private Long ruleId;
    private String ruleIds;
    private Long memberId;
    private String code;
    private String marketingId;
    private Long memberCouponId;
    private BigDecimal payAmount;
    private String openId;

    public void accept(Market target) {
        target.setCreateTime(new Date(System.currentTimeMillis()));
        target.setCartItems(cartList);
        target.setOrderItems(shopOrderGoodsList);
        target.setOrderType(new OrderType(type));
        target.setMarketScope(scope);
        target.setRule(new Rule(rule));
        target.setRuleId(ruleId);
        target.setMemberId(new UserId(memberId));
        target.setPostCode(new PostCode(code));
        target.setMarketId(new MarketId(marketingId));
        target.setMemberCouponId(new MemberCouponId(memberCouponId));
        target.setTotalFee(new TotalFee(payAmount));
        target.setOpenId(new OpenId(openId));


    }


}
