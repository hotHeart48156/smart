package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.Note;
import org.activite.domain.activite.valueobject.OrderSn;
import org.activite.domain.activite.valueobject.code.CouponCode;
import org.activite.domain.activite.valueobject.id.CouponId;
import org.activite.domain.activite.valueobject.id.OrderId;
import org.activite.domain.activite.valueobject.id.UserId;
import org.activite.domain.activite.valueobject.name.UserNickName;
import org.activite.domain.activite.valueobject.status.CouponUseStatus;
import org.activite.domain.activite.valueobject.time.CouponUseTime;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;
import org.activite.domain.activite.valueobject.type.CouponGetType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class CouponHistory {
    @Embedded
private  CouponId couponId;
    @Embedded
private  UserId userId;
    @EmbeddedId
private  CouponCode couponCode;
    @Embedded
private  UserNickName userNickName;
    @Embedded
private  CouponGetType couponGetType;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  CouponUseStatus couponUseStatus;
    @Embedded
private  CouponUseTime couponUseTime;
    @Embedded
private  OrderSn orderSn;
    @Embedded
private  OrderId orderId;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  Note note;

}
