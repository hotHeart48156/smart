package org.users.domain.valueobject.status;

import javax.persistence.Column;

public enum RoleStatus implements AbstractStatus {
    DISABLE(0), ENABLE(1);
    @Column(name ="   userStatus")
    private int index;

    RoleStatus(int i) {
        index = i;
    }
}
