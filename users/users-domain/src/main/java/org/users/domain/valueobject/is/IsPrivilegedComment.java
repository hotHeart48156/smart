package org.users.domain.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum IsPrivilegedComment implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isPrivilegedComment")
private int index;

    IsPrivilegedComment(int i) {
        this.index = i;

    }
}
