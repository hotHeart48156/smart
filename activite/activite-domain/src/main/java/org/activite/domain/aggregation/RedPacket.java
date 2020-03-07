package org.activite.domain.aggregation;

import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.amount.RedPacketAmount;
import org.activite.domain.valueobject.amount.RedPacketReceiveAmount;
import org.activite.domain.valueobject.amount.SingleRedPacketAmount;
import org.activite.domain.valueobject.count.RedPacketCount;
import org.activite.domain.valueobject.count.RedPacketStock;
import org.activite.domain.valueobject.id.RedPacketId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.status.RedPacketStatus;
import org.activite.domain.valueobject.time.SendTime;
import org.activite.domain.valueobject.type.RedPacketType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class RedPacket {
    @EmbeddedId
private RedPacketId redPacketId;
    @Embedded
private UserId userId;
    @Embedded
private RedPacketAmount redPacketAmount;
    @Embedded
private SendTime sendTime;
    @Embedded
private RedPacketCount redPacketCount;
    @Embedded
private SingleRedPacketAmount singleRedPacketAmount;
    @Embedded
private RedPacketStock redPacketStock;
    @Embedded
private RedPacketType redPacketType;
    @Embedded
private Note note;
    @Embedded
private RedPacketStatus redPacketStatus;
    @Embedded
private RedPacketReceiveAmount redPacketReceiveAmount;

}
