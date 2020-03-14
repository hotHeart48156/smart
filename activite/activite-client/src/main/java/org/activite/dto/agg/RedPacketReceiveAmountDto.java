package org.activite.dto.agg;

@Data
public class RedPacketReceiveAmountDto {
    private String ActiviteId;
    private String redPacketReceiveAmount;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketReceiveAmount(ValueObjectFactory.newInstance(RedPacketReceiveAmount.class, this.redPacketReceiveAmount));
    }
}
