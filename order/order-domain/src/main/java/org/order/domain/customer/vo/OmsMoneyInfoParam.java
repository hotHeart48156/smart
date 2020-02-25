package org.order.domain.customer.vo;

import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.vaueobject.fee.DiscountFee;
import org.order.domain.customer.vaueobject.fee.FreightFee;
import org.order.domain.customer.vaueobject.id.OrderId;

import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 * https://github.com/shenzhuan/mallplus on 2018/10/29.
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;

    public void accept(MoneyInfo moneyInfo) {
        moneyInfo.setDiscountFee(new DiscountFee(discountAmount));
        moneyInfo.setFreightFee(new FreightFee(freightAmount));
        moneyInfo.setOrderId(new OrderId(orderId));

    }
}
