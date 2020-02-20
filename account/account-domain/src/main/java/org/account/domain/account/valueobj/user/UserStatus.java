package org.account.domain.account.valueobj.user;

import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */
public class UserStatus extends AbstructUser {
    private Integer status;

    UserStatus(Integer stat) {
        status = stat;
    }

    public Integer getStatus() {
        return status;
    }
}
