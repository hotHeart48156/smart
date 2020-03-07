package org.users.domain.valueobject.type;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */

public enum RoleType implements AbstractType {
    USER(1), BUSINESS(2), ADMIN(3);
    @Column(name ="   roleType")
private int index;

    RoleType(int i) {
        this.index = i;
    }
}
