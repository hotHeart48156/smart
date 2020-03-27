package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.status.RedPacketStatus;

@Data
public class  RedPacketStatusDto  extends AbstractRedPacketDto{
private String redPacketStatus;
public void accept(RedPacket redpacket){
redpacket.setRedPacketStatus(ValueObjectFactory.newInstance(RedPacketStatus.class ,this.redPacketStatus));
}
}
