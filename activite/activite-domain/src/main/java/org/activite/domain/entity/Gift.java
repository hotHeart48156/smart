package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.ActivityGoods;
import org.activite.domain.valueobject.ActivityUser;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.id.GiftId;
import org.activite.domain.valueobject.id.GoodsId;
import org.activite.domain.valueobject.name.GiftName;
import org.activite.domain.valueobject.status.GiftStatus;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.GiftType;
import org.activite.domain.valueobject.type.SmallType;
import org.activite.domain.valueobject.user.UserLevel;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Entity
@Data

public class Gift extends AbstractEntity {
    @EmbeddedId
private GiftId giftId;
    @Embedded
private GiftName giftName;
    @Embedded
private GiftStatus giftStatus;
    @Embedded
private ActivityUser activityUser;
    @Embedded
private ActivityGoods activityGoods;
    @Embedded
private GiftType giftType;
    @Embedded
private SmallType smallType;
    @Embedded
private  List<GoodsId> goodsIds;
    @Embedded
private UserLevel userLevel;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private Note note;
    @Embedded
private  List<GiftId> giftIds;
}
