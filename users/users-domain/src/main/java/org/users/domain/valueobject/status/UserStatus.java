package org.users.domain.valueobject.status;

import org.users.domain.valueobject.is.AbstractStatus;

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
