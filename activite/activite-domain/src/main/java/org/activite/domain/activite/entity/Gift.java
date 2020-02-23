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

import java.util.List;

/**
 * @author "yangbiao"
 */
public class Gift {
    private GiftId giftId;
    private GiftName giftName;
    private GiftStatus giftStatus;
    private ActivityUser activityUser;
    private ActivityGoods activityGoods;
    private GiftType giftType;
    private SmallType smallType;
    private List<GoodsId> goodsIds;
    private UserLevel userLevel;
    private StartTime startTime;
    private EndTime endTime;
    private Note note;
    private List<GiftId> giftIds;
}
