package org.users.domain.customer.valueobject.status;

import org.users.domain.customer.valueobject.is.AbstractStatus;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum UserStatus implements AbstractStatus {
    DISABLE(0), ENABLE(1);
    @Column(name ="   userStatus")
private int index;

    UserStatus(int i) {
        index = i;
    }
}
