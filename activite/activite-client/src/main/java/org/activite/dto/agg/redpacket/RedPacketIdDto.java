package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.RedPacketId;

@Data
public class  RedPacketIdDto  extends AbstractRedPacketDto{
private String redPacketId;
public void accept(RedPacket redpacket){
redpacket.setRedPacketId(ValueObjectFactory.newInstance(RedPacketId.class ,this.redPacketId));
}
}
