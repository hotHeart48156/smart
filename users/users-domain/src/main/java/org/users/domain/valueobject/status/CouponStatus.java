package org.users.domain.valueobject.status;

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
