package org.activite.domain.activite.aggregation;

import lombok.Data;
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

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class Coupon {
    @EmbeddedId

private  CouponId couponId;
    @Embedded
private  CouponType couponType;
    @Embedded
private  CouponName couponName;
    @Embedded
private  Platform platform;
    @Embedded
private  CouponCount couponCount;
    @Embedded
private  CouponAmount couponAmount;
    @Embedded
private  CouponMinPoint couponMinPoint;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  CouponUserType couponUserType;
    @Embedded
private  Note note;
    @Embedded
private  CouponPublishCount couponPublishCount;
    @Embedded
private  CouponUsedCount couponUsedCount;
    @Embedded
private  CouponReceiverCount couponReceiverCount;
    @Embedded
private  CouponEnableTime couponEnableTime;
    @Embedded
private  CouponCode couponCode;
    @Embedded
private  UserLevel userLevel;

}
