package org.users.domain.customer.valueobject.type;

/**
 * @author "yangbiao"
 */
public enum TagType implements AbstractType {
    MEMBER(1), PRODUCT(2), ARTICLE(3);
    private int index;

    TagType(int i) {
        index = i;
    }
}
