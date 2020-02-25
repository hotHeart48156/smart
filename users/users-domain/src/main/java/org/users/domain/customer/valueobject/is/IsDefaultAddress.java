package org.users.domain.customer.valueobject.is;

import lombok.Value;

/**
 * @author "yangbiao"
 */

public enum IsDefaultAddress implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;

    IsDefaultAddress(int i) {
        this.index = i;
    }
}
