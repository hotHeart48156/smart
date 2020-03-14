package org.order.dto.aggredto;

@Data
public class NoteDto {
    private String OrderId;
    private String note;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(OrderId.class, this.OrderId));
        order.setNote(ValueObjectFactory.newInstance(Note.class, this.note));
    }
}
