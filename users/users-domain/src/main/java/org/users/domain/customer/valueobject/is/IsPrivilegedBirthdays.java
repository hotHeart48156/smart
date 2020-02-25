package org.users.domain.customer.valueobject.is;

/**
 * @author "yangbiao"
 */
public enum IsPrivilegedBirthdays implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;


    IsPrivilegedBirthdays(int i) {
        this.index = i;
    }
}
