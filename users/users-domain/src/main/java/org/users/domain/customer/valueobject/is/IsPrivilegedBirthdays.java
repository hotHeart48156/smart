package org.users.domain.customer.valueobject.is;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum IsPrivilegedBirthdays implements AbstractIs {
    IS(1), NOTIS(0);

    @Column(name ="   isPrivilegedBirthdays")
private int index;


    IsPrivilegedBirthdays(int i) {
        this.index = i;
    }
}
