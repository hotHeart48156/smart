package org.order.dto.aggredto;

@Data
public class OrderStatusDto {
    private String OrderId;
    private String orderStatus;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(OrderId.class, this.OrderId));
        order.setOrderStatus(ValueObjectFactory.newInstance(OrderStatus.class, this.orderStatus));
    }
}
