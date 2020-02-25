package org.users.domain.customer.valueobject.is;

/**
 * @author "yangbiao"
 */
public enum IsPrivilegedMemberPrice implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;

    IsPrivilegedMemberPrice(int i) {
        this.index = i;

    }
}
