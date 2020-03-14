package org.activite.dto.agg;

@Data
public class RedPacketIdDto {
    private String ActiviteId;
    private String redPacketId;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketId(ValueObjectFactory.newInstance(RedPacketId.class, this.redPacketId));
    }
}
