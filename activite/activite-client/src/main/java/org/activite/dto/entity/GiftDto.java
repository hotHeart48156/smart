package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.Gift;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.GiftId;
import org.activite.domain.valueobject.name.GiftName;
import org.activite.domain.valueobject.status.GiftStatus;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.GiftType;
import org.activite.domain.valueobject.type.SmallType;
import org.activite.domain.valueobject.user.UserLevel;

import java.sql.Timestamp;

@Data
public class GiftDto   extends AbstractEntityDto{
    private String giftId;
    private String giftName;
    private String giftStatus;
    private String activityUser;
    private String activityGoods;
    private String giftType;
    private String smallType;
    private String userLevel;
    private String startTime;
    private String endTime;
    private String note;

    public void accept(Gift gift) {
        gift.setGiftId(ValueObjectFactory.newInstance(GiftId.class, giftId));
        gift.setGiftName(ValueObjectFactory.newInstance(GiftName.class, giftName));
        gift.setGiftStatus(ValueObjectFactory.newInstance(GiftStatus.class, giftStatus));
        gift.setActivityUser(ValueObjectFactory.newInstance(ActivityUser.class, activityUser));
        gift.setActivityGoods(ValueObjectFactory.newInstance(ActivityGoods.class, activityGoods));
        gift.setGiftType(ValueObjectFactory.newInstance(GiftType.class, giftType));
        gift.setSmallType(ValueObjectFactory.newInstance(SmallType.class, smallType));
        gift.setUserLevel(ValueObjectFactory.newInstance(UserLevel.class, userLevel));
        gift.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        gift.setEndTime(ValueObjectFactory.newInstance(EndTime.class, new Timestamp(System.currentTimeMillis())));
        gift.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
