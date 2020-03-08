package org.order.domain.vaueobject.status;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
public enum ConfirmStatus implements Status {
    DISABLE(0), ENABLE(1);
    @Column(name ="   userStatus")
    private int index;

    ConfirmStatus(int i) {
        index = i;
    }

}
