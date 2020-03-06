package org.users.domain.customer.valueobject.type;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum GrowthSourceType {
    SHOOPINT(0), MANAGE(1);
    @Column(name ="   growthSourceType")
private int inedex;

    GrowthSourceType(int i) {
        inedex = i;
    }
}
