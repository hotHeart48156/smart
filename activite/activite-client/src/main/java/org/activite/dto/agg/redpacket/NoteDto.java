package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class NoteDto {
    private String ActiviteId;
    private String note;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setNote(ValueObjectFactory.newInstance(Note.class, this.note));
    }
}
