package org.users.domain.customer.valueobject.type;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum CollectType {
    SHOOPINT(0), MANAGE(1);
    @Column(name ="   growthSourceType")
    private int inedex;

    CollectType(int i) {
        inedex = i;
    }
}
