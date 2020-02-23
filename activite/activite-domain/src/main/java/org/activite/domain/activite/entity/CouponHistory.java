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

/**
 * @author "yangbiao"
 */
public class CouponHistory {
    private CouponId couponId;
    private UserId userId;
    private CouponCode couponCode;
    private UserNickName userNickName;
    private CouponGetType couponGetType;
    private CreateTime createTime;
    private CouponUseStatus couponUseStatus;
    private CouponUseTime couponUseTime;
    private OrderSn orderSn;
    private OrderId orderId;
    private StartTime startTime;
    private EndTime endTime;
    private Note note;

}
