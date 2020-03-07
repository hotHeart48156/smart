package org.users.domain.valueobject.type;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum ChangeType implements AbstractType{
    SHOOPINT(0), MANAGE(1);
    @Column(name ="   growthSourceType")
    private int inedex;

    ChangeType(int i) {
        inedex = i;
    }
}
