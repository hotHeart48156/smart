package org.activite.domain.valueobject.type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum CouponGetType implements Type
{
    GIVEAWAY(0),INITIATIVE(1);
@Column(name ="   couponGetType")
private  int   couponGetType;

    CouponGetType(int type) {
        this.couponGetType=type;
    }

    public int getCouponGetType() {
        return couponGetType;
    }
}
