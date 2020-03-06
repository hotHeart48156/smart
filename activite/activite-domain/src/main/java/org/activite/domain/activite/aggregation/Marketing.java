package org.activite.domain.activite.aggregation;

import org.activite.domain.activite.valueobject.ActivityGoods;
import org.activite.domain.activite.valueobject.ActivityUser;
import org.activite.domain.activite.valueobject.id.MarketingId;
import org.activite.domain.activite.valueobject.name.MarketingName;
import org.activite.domain.activite.valueobject.status.MarketStatus;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;
import org.activite.domain.activite.valueobject.type.DiscountType;
import org.activite.domain.activite.valueobject.type.SmallType;
import org.activite.domain.activite.valueobject.user.UserLevel;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class Marketing {
    @EmbeddedId
private  MarketingId marketingId;
    @Embedded
private  MarketingName marketingName;
    @Embedded
private  MarketStatus marketStatus;
    @Embedded
private  ActivityUser activityUser;
    @Embedded
private  ActivityGoods activityGoods;
    @Embedded
private  DiscountType discountType;
    @Embedded
private  SmallType smallType;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  UserLevel userLevel;
    @Embedded
private  CreateTime createTime;


}
