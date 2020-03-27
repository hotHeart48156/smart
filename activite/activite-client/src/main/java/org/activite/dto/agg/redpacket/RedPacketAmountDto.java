package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.amount.RedPacketAmount;

@Data
public class  RedPacketAmountDto  extends AbstractRedPacketDto{
private String redPacketAmount;
public void accept(RedPacket redpacket){
redpacket.setRedPacketAmount(ValueObjectFactory.newInstance(RedPacketAmount.class ,this.redPacketAmount));
}
}
