package org.order.dto.aggredto;

@Data
public class ReceiverNameDto {
    private String OrderId;
    private String receiverName;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(OrderId.class, this.OrderId));
        order.setReceiverName(ValueObjectFactory.newInstance(ReceiverName.class, this.receiverName));
    }
}
