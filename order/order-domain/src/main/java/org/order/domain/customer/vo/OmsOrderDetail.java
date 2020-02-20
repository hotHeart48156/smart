package org.order.domain.customer.vo;


import lombok.Getter;
import lombok.Setter;
import org.order.domain.customer.entity.Order;
import org.order.domain.customer.entity.OrderItem;
import org.order.domain.customer.entity.OrderOperateHistory;

import java.util.List;


/**
 * 订单详情信息
 * https://github.com/shenzhuan/mallplus on 2018/10/11.
 */
public class OmsOrderDetail extends Order {
    @Getter
    @Setter
    private List<OrderItem> orderItemList;
    @Getter
    @Setter
    private List<OrderOperateHistory> historyList;
}
