package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.SendTime;

@Data
public class  SendTimeDto  extends AbstractRedPacketDto{
private String sendTime;
public void accept(RedPacket redpacket){
redpacket.setSendTime(ValueObjectFactory.newInstance(SendTime.class ,this.sendTime));
}
}
