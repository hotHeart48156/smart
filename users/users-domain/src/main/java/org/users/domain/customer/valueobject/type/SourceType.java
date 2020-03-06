package org.users.domain.customer.valueobject.type;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum SourceType {
    APPlETS(1), OFFCIAANOUNT(2), WEBSITE(3);
    @Column(name ="   sourceType")
private int index;

    SourceType(int i) {
        index = i;
    }
}
