package org.users.domain.customer.valueobject.status;

/**
 * @author "yangbiao"
 */
public enum CouponStatus {
    DISABLE(0), ENABLE(1);
    private int index;


    CouponStatus(int i) {
        index = i;
    }
}
