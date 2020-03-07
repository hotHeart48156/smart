package org.users.domain.valueobject.type;

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
