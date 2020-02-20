package org.account.domain.account.valueobj.user;

import org.account.domain.account.valueobj.ValueObject;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author "yangbiao"
 */
public class UserCreateTime extends AbstructUser {
    private Timestamp createTime;

    UserCreateTime(Timestamp time) {
        createTime = time;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
