package org.activite.dto.agg.redpacket;

import lombok.Data;
import org.activite.domain.aggregation.RedPacket;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.amount.RedPacketReceiveAmount;

@Data
public class RedPacketReceiveAmountDto {
    private String ActiviteId;
    private String redPacketReceiveAmount;

    public void accept(RedPacket redpacket) {
        redpacket.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        redpacket.setRedPacketReceiveAmount(ValueObjectFactory.newInstance(RedPacketReceiveAmount.class, this.redPacketReceiveAmount));
    }
}
