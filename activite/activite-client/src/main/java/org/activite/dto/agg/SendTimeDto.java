package org.activite.dto.agg;

@Data
public class SendTimeDto {
    private String ActiviteId;
    private String sendTime;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setSendTime(ValueObjectFactory.newInstance(SendTime.class, this.sendTime));
    }
}
