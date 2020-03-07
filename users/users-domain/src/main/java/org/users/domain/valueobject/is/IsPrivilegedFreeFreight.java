package org.users.domain.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum IsPrivilegedFreeFreight implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isPrivilegedFreeFreight")
private int index;

    IsPrivilegedFreeFreight(int i) {
        this.index = i;

    }
}
