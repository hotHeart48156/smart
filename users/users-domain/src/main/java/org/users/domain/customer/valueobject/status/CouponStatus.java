package org.users.domain.customer.valueobject.status;

import org.users.domain.customer.valueobject.is.AbstractStatus;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum CouponStatus implements AbstractStatus {
    DISABLE(0), ENABLE(1);
    @Column(name ="   couponStatus")
private int index;


    CouponStatus(int i) {
        index = i;
    }
}
