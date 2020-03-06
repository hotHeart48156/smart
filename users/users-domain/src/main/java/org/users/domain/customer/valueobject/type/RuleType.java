package org.users.domain.customer.valueobject.type;

import javafx.css.Rule;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum RuleType {
    SHOOPINT(0), MANAGE(1);
    @Column(name ="   growthSourceType")
    private int inedex;

    RuleType(int i) {
        inedex = i;
    }
}
