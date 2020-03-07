package org.users.domain.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */

public enum IsDefaultAddress implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isDefaultAddress")
private int index;

    IsDefaultAddress(int i) {
        this.index = i;
    }
}
