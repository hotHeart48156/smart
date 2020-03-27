package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.type.RedPacketType;

@Data
public class  RedPacketTypeDto  extends AbstractRedPacketDto{
private String redPacketType;
public void accept(RedPacket redpacket){
redpacket.setRedPacketType(ValueObjectFactory.newInstance(RedPacketType.class ,this.redPacketType));
}
}
