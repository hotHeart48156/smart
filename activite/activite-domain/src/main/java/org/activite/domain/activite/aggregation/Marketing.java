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

/**
 * @author "yangbiao"
 */
public class Marketing {
    private MarketingId marketingId;
    private MarketingName marketingName;
    private MarketStatus marketStatus;
    private ActivityUser activityUser;
    private ActivityGoods activityGoods;
    private DiscountType discountType;
    private SmallType smallType;
    private StartTime startTime;
    private EndTime endTime;
    private UserLevel userLevel;
    private CreateTime createTime;


}
