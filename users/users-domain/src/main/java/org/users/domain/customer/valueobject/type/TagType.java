package org.users.domain.customer.valueobject.type;

import org.users.domain.customer.valueobject.is.AbstractType;

import javax.persistence.Column;

/**
 * @author "yangbiao"
 */
public enum TagType implements AbstractType {
    MEMBER(1), PRODUCT(2), ARTICLE(3);
    @Column(name ="   tagType")
private int index;

    TagType(int i) {
        index = i;
    }
}
