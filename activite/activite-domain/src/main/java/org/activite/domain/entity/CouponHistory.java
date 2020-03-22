package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.OrderSn;
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
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Entity
@Data
@Table(name  ="smart.coupon_history")
public class CouponHistory extends AbstractEntity{
    @EmbeddedId
private CouponId couponId;
    @Embedded
private UserId userId;
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
