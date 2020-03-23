package org.activite.dto.agg.redpacket;

@Data
public class RedPacketStockDto {
    private String ActiviteId;
    private String redPacketStock;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketStock(ValueObjectFactory.newInstance(RedPacketStock.class, this.redPacketStock));
    }
}
