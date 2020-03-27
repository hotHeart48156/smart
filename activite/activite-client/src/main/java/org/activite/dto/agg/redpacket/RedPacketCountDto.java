package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.RedPacketCount;

@Data
public class  RedPacketCountDto  extends AbstractRedPacketDto{
private String redPacketCount;
public void accept(RedPacket redpacket){
redpacket.setRedPacketCount(ValueObjectFactory.newInstance(RedPacketCount.class ,this.redPacketCount));
}
}
