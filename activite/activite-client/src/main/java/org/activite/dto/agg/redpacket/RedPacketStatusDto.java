package org.activite.dto.agg.redpacket;

@Data
public class RedPacketStatusDto {
    private String ActiviteId;
    private String redPacketStatus;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketStatus(ValueObjectFactory.newInstance(RedPacketStatus.class, this.redPacketStatus));
    }
}
