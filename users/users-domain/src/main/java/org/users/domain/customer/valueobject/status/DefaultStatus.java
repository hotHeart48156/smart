package org.users.domain.customer.valueobject.status;

import org.users.domain.customer.valueobject.is.AbstractStatus;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
public enum DefaultStatus implements AbstractStatus {
    DISABLE(0), ENABLE(1);
    @Column(name ="   defaultStatus")
private int index;


    DefaultStatus(int i) {
        index = i;
    }
}
