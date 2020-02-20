package org.account.domain.account.valueobj.user;

import org.account.domain.account.valueobj.ValueObject;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class UserLoginTime extends AbstructUser {
    private Date loginTime;

    UserLoginTime(Date time) {
        loginTime = time;
    }

    public Date getCreateTime() {
        return loginTime;
    }
}
