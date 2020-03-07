package org.activite.domain.entity;

import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.OrderSn;
import org.activite.domain.valueobject.code.CouponCode;
import org.activite.domain.valueobject.id.CouponId;
import org.activite.domain.valueobject.id.OrderId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.name.UserNickName;
import org.activite.domain.valueobject.status.CouponUseStatus;
import org.activite.domain.valueobject.time.CouponUseTime;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.CouponGetType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class CouponHistory {
    @Embedded
private CouponId couponId;
    @Embedded
private UserId userId;
    @EmbeddedId
private CouponCode couponCode;
    @Embedded
private UserNickName userNickName;
    @Embedded
private CouponGetType couponGetType;
    @Embedded
private CreateTime createTime;
    @Embedded
private CouponUseStatus couponUseStatus;
    @Embedded
private CouponUseTime couponUseTime;
    @Embedded
private OrderSn orderSn;
    @Embedded
private OrderId orderId;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private Note note;

}
