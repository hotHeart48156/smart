package org.activite.domain.activite.aggre;

import org.activite.domain.activite.valueobject.CouponMinPoint;
import org.activite.domain.activite.valueobject.Note;
import org.activite.domain.activite.valueobject.Platform;
import org.activite.domain.activite.valueobject.amount.CouponAmount;
import org.activite.domain.activite.valueobject.code.CouponCode;
import org.activite.domain.activite.valueobject.count.CouponCount;
import org.activite.domain.activite.valueobject.count.CouponPublishCount;
import org.activite.domain.activite.valueobject.count.CouponReceiverCount;
import org.activite.domain.activite.valueobject.count.CouponUsedCount;
import org.activite.domain.activite.valueobject.id.CouponId;
import org.activite.domain.activite.valueobject.name.CouponName;
import org.activite.domain.activite.valueobject.time.CouponEnableTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;
import org.activite.domain.activite.valueobject.type.CouponType;
import org.activite.domain.activite.valueobject.type.CouponUserType;
import org.activite.domain.activite.valueobject.user.UserLevel;

/**
 * @author "yangbiao"
 */
public class Coupon {
    private CouponId couponId;
    private CouponType couponType;
    private CouponName couponName;
    private Platform platform;
    private CouponCount couponCount;
    private CouponAmount couponAmount;
    private CouponMinPoint couponMinPoint;
    private StartTime startTime;
    private EndTime endTime;
    private CouponUserType couponUserType;
    private Note note;
    private CouponPublishCount couponPublishCount;
    private CouponUsedCount couponUsedCount;
    private CouponReceiverCount couponReceiverCount;
    private CouponEnableTime couponEnableTime;
    private CouponCode couponCode;
    private UserLevel userLevel;

}
