package org.users.domain.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum IsPrivilegedPromotion implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isPrivilegedPromotion")
private int index;


    IsPrivilegedPromotion(int i) {
        this.index = i;

    }
}
