package org.activite.domain.aggregation;

import org.activite.domain.valueobject.ActivityGoods;
import org.activite.domain.valueobject.ActivityUser;
import org.activite.domain.valueobject.id.MarketingId;
import org.activite.domain.valueobject.name.MarketingName;
import org.activite.domain.valueobject.status.MarketStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.DiscountType;
import org.activite.domain.valueobject.type.SmallType;
import org.activite.domain.valueobject.user.UserLevel;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class Marketing {
    @EmbeddedId
private MarketingId marketingId;
    @Embedded
private MarketingName marketingName;
    @Embedded
private MarketStatus marketStatus;
    @Embedded
private ActivityUser activityUser;
    @Embedded
private ActivityGoods activityGoods;
    @Embedded
private DiscountType discountType;
    @Embedded
private SmallType smallType;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private UserLevel userLevel;
    @Embedded
private CreateTime createTime;


}
