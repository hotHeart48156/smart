package org.users.domain.customer.valueobject.is;

/**
 * @author "yangbiao"
 */
public enum IsPrivilegedFreeFreight implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;

    IsPrivilegedFreeFreight(int i) {
        this.index = i;

    }
}
