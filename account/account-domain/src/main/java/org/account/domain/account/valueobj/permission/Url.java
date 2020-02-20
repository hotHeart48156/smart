package org.account.domain.account.valueobj.permission;

/**
 * @author "yangbiao"
 */
public class Url extends AbstructPermission {
    private String url;

    Url(String Url) {
        url = Url;
    }

    public String getUrl() {
        return url;
    }
}
