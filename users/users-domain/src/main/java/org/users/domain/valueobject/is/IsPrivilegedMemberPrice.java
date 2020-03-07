package org.users.domain.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum IsPrivilegedMemberPrice implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isPrivilegedMemberPrice")
private int index;

    IsPrivilegedMemberPrice(int i) {
        this.index = i;

    }
}
