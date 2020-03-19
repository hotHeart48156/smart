package org.activite.domain.aggregation;

import lombok.Data;
import org.activite.domain.valueobject.CouponMinPoint;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.Platform;
import org.activite.domain.valueobject.ProductAttributes;
import org.activite.domain.valueobject.amount.CouponAmount;
import org.activite.domain.valueobject.code.CouponCode;
import org.activite.domain.valueobject.count.CouponCount;
import org.activite.domain.valueobject.count.CouponPublishCount;
import org.activite.domain.valueobject.count.CouponReceiverCount;
import org.activite.domain.valueobject.count.CouponUsedCount;
import org.activite.domain.valueobject.id.CouponId;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.CouponName;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.time.CouponEnableTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.CouponType;
import org.activite.domain.valueobject.type.CouponUserType;
import org.activite.domain.valueobject.user.UserLevel;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Coupon extends AbstractAggregation{
    @EmbeddedId

    private CouponId couponId;
    @Embedded
    private ProductId productId;
    @Embedded

    private ProductName productName;
    @Embedded
    private ProductAttributes productAttributes;

    private CouponType couponType;
    @Embedded
    private CouponName couponName;
    @Embedded
    private Platform platform;
    @Embedded
    private CouponCount couponCount;
    @Embedded
    private CouponAmount couponAmount;
    @Embedded
    private CouponMinPoint couponMinPoint;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private CouponUserType couponUserType;
    @Embedded
private Note note;
    @Embedded
private CouponPublishCount couponPublishCount;
    @Embedded
private CouponUsedCount couponUsedCount;
    @Embedded
private CouponReceiverCount couponReceiverCount;
    @Embedded
private CouponEnableTime couponEnableTime;
    @Embedded
private CouponCode couponCode;
    @Embedded
private UserLevel userLevel;

}
