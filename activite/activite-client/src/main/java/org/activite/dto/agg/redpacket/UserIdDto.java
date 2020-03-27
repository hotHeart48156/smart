package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.UserId;

@Data
public class  UserIdDto  extends AbstractRedPacketDto{
private String userId;
public void accept(RedPacket redpacket){
redpacket.setUserId(ValueObjectFactory.newInstance(UserId.class ,this.userId));
}
}
