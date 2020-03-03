package org.activite.domain.activite.aggregation;

import org.activite.domain.activite.valueobject.Note;
import org.activite.domain.activite.valueobject.amount.RedPacketAmount;
import org.activite.domain.activite.valueobject.amount.RedPacketReceiveAmount;
import org.activite.domain.activite.valueobject.amount.SingleRedPacketAmount;
import org.activite.domain.activite.valueobject.count.RedPacketCount;
import org.activite.domain.activite.valueobject.count.RedPacketStock;
import org.activite.domain.activite.valueobject.id.RedPacketId;
import org.activite.domain.activite.valueobject.id.UserId;
import org.activite.domain.activite.valueobject.status.RedPacketStatus;
import org.activite.domain.activite.valueobject.time.SendTime;
import org.activite.domain.activite.valueobject.type.RedPacketType;

/**
 * @author "yangbiao"
 */
public class RedPacket {
    private RedPacketId redPacketId;
    private UserId userId;
    private RedPacketAmount redPacketAmount;
    private SendTime sendTime;
    private RedPacketCount redPacketCount;
    private SingleRedPacketAmount singleRedPacketAmount;
    private RedPacketStock redPacketStock;
    private RedPacketType redPacketType;
    private Note note;
    private RedPacketStatus redPacketStatus;
    private RedPacketReceiveAmount redPacketReceiveAmount;

}
