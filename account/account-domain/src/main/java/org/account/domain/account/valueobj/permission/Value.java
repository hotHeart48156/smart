package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class Value extends AbstructPermission {
    private String value;

    Value(String Value) {
        value = Value;


    }

    public String getValue() {
        return value;
    }
}
