package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.RedPacketStock;

@Data
public class  RedPacketStockDto  extends AbstractRedPacketDto{
private String redPacketStock;
public void accept(RedPacket redpacket){
redpacket.setRedPacketStock(ValueObjectFactory.newInstance(RedPacketStock.class ,this.redPacketStock));
}
}
