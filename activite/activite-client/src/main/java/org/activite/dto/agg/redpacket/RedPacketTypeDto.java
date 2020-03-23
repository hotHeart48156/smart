package org.activite.dto.agg.redpacket;

@Data
public class RedPacketTypeDto {
    private String ActiviteId;
    private String redPacketType;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketType(ValueObjectFactory.newInstance(RedPacketType.class, this.redPacketType));
    }
}
