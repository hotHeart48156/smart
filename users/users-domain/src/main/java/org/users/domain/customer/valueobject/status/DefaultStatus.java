package org.users.domain.customer.valueobject.status;

/**
 * @author "yangbiao"
 */
public enum DefaultStatus {
    DISABLE(0), ENABLE(1);
    private int index;


    DefaultStatus(int i) {
        index = i;
    }
}
