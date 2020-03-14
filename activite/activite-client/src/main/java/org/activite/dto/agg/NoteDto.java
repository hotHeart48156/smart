package org.activite.dto.agg;

@Data
public class NoteDto {
    private String ActiviteId;
    private String note;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setNote(ValueObjectFactory.newInstance(Note.class, this.note));
    }
}
