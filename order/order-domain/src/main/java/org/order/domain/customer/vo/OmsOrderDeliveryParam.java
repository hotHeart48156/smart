package org.order.domain.customer.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.name.DeliveryCompanyName;
import org.order.domain.customer.vaueobject.sn.DeliverySn;
import org.order.domain.customer.vaueobject.time.CreateTime;

import java.util.Date;

/**
 * 订单发货参数
 * https://github.com/shenzhuan/mallplus on 2018/10/12.
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;

    public void accept(OrderDelivery orderDelivery) {
        orderDelivery.setDeliveryCompanyName(new DeliveryCompanyName(deliveryCompany));
        orderDelivery.setOrderId(new OrderId(orderId));
        orderDelivery.setDeliverySn(new DeliverySn(deliverySn));
        orderDelivery.setCreateTime(new CreateTime(new Date(System.currentTimeMillis())));
    }
}
