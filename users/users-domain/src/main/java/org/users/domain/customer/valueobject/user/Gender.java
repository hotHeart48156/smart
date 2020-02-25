package org.users.domain.customer.valueobject.user;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.users.domain.customer.valueobject.ValueObject;

/**
 * @author "yangbiao"
 */
public enum Gender implements ValueObject {
    MAIL(1), FEMAIL(2), NOTKNOW(0);
    private int index;

    Gender(int i) {
        this.index = i;
    }
}
