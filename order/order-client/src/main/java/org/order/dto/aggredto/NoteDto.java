package org.order.dto.aggredto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.vaueobject.Note;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.dto.AbstractDto;

@Data
public class NoteDto   extends AbstractDto {
    private String OrderId;
    private String note;

    public void accept(Order order) {
        order.setOrderId(ValueObjectFactory.newInstance(org.order.domain.vaueobject.id.OrderId.class, this.OrderId));
        order.setNote(ValueObjectFactory.newInstance(Note.class, this.note));
    }
}
