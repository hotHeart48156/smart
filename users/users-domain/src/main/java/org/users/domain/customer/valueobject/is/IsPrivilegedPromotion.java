package org.users.domain.customer.valueobject.is;

/**
 * @author "yangbiao"
 */
public enum IsPrivilegedPromotion implements AbstractIs {
    IS(1), NOTIS(0);

    private int index;


    IsPrivilegedPromotion(int i) {
        this.index = i;

    }
}
