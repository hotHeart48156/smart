package org.activite.dto.agg;

@Data
public class RedPacketAmountDto {
    private String ActiviteId;
    private String redPacketAmount;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketAmount(ValueObjectFactory.newInstance(RedPacketAmount.class, this.redPacketAmount));
    }
}
