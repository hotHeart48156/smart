package org.activite.dto.agg.redpacket;

@Data
public class RedPacketCountDto {
    private String ActiviteId;
    private String redPacketCount;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketCount(ValueObjectFactory.newInstance(RedPacketCount.class, this.redPacketCount));
    }
}
