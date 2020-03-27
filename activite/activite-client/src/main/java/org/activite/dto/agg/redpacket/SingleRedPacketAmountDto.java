package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.amount.SingleRedPacketAmount;

@Data
public class  SingleRedPacketAmountDto  extends AbstractRedPacketDto{
private String singleRedPacketAmount;
public void accept(RedPacket redpacket){
redpacket.setSingleRedPacketAmount(ValueObjectFactory.newInstance(SingleRedPacketAmount.class ,this.singleRedPacketAmount));
}
}
