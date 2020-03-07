package org.users.domain.valueobject.type;


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
