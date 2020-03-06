package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.ActivityGoods;
import org.activite.domain.activite.valueobject.ActivityUser;
import org.activite.domain.activite.valueobject.Note;
import org.activite.domain.activite.valueobject.id.GiftId;
import org.activite.domain.activite.valueobject.id.GoodsId;
import org.activite.domain.activite.valueobject.name.GiftName;
import org.activite.domain.activite.valueobject.status.GiftStatus;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;
import org.activite.domain.activite.valueobject.type.GiftType;
import org.activite.domain.activite.valueobject.type.SmallType;
import org.activite.domain.activite.valueobject.user.UserLevel;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.util.List;

/**
 * @author "yangbiao"
 */
public class Gift {
    @EmbeddedId
private  GiftId giftId;
    @Embedded
private  GiftName giftName;
    @Embedded
private  GiftStatus giftStatus;
    @Embedded
private  ActivityUser activityUser;
    @Embedded
private  ActivityGoods activityGoods;
    @Embedded
private  GiftType giftType;
    @Embedded
private  SmallType smallType;
    @Embedded
private  List<GoodsId> goodsIds;
    @Embedded
private  UserLevel userLevel;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  Note note;
    @Embedded
private  List<GiftId> giftIds;
}
