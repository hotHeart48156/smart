package org.activite.dto.agg;

@Data
public class SingleRedPacketAmountDto {
    private String ActiviteId;
    private String singleRedPacketAmount;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setSingleRedPacketAmount(ValueObjectFactory.newInstance(SingleRedPacketAmount.class, this.singleRedPacketAmount));
    }
}
