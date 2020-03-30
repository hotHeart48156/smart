package org.activite.domain.valueobject.status;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
public enum CouponUseStatus implements Status
{
UNUSED(0),USED(1),EXPIRED(2);
@Column(name ="   couponUseStatus")
private  int   couponUseStatus;

    CouponUseStatus(int status) {
        this.couponUseStatus=status;
    }

    public int getCouponUseStatus() {
        return couponUseStatus;
    }
}
