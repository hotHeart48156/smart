package org.users.domain.customer.valueobject.is;

/**
 * @author "yangbiao"
 */
public enum IsPrivilegedComment implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;

    IsPrivilegedComment(int i) {
        this.index = i;

    }
}
