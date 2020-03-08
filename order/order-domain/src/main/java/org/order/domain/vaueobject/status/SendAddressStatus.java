package org.order.domain.vaueobject.status;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum SendAddressStatus implements Status {
    DISABLE(0), ENABLE(1);
    @Column(name ="   userStatus")
    private int index;

    SendAddressStatus(int i) {
        index = i;
    }
}
