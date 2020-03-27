package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  NoteDto  extends AbstractRedPacketDto{
private String note;
public void accept(RedPacket redpacket){
redpacket.setNote(ValueObjectFactory.newInstance(Note.class ,this.note));
}
}
