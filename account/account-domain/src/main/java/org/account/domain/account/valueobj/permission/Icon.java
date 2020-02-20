package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class Icon extends AbstructPermission {
    private String icon;

    Icon(String Icon) {
        icon = Icon;
    }

    public String getIcon() {
        return icon;
    }
}
