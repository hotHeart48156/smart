package org.users.domain.customer.valueobject.type;

/**
 * @author "yangbiao"
 */
public enum SourceType {
    APPlETS(1), OFFCIAANOUNT(2), WEBSITE(3);
    private int index;

    SourceType(int i) {
        index = i;
    }
}
