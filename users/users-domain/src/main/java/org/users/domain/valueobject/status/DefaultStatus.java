package org.users.domain.valueobject.status;

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
