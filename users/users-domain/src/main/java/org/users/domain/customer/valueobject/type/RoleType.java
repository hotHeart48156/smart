package org.users.domain.customer.valueobject.type;

import org.checkerframework.checker.units.qual.A;

/**
 * @author "yangbiao"
 */

public enum RoleType implements AbstractType {
    USER(1), BUSINESS(2), ADMIN(3);
    private int index;

    RoleType(int i) {
        this.index = i;
    }
}
