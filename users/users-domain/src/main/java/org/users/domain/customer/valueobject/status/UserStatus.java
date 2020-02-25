package org.users.domain.customer.valueobject.status;

/**
 * @author "yangbiao"
 */
public enum UserStatus {
    DISABLE(0), ENABLE(1);
    private int index;

    UserStatus(int i) {
        index = i;
    }
}
