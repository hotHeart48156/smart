package org.account.domain.account.valueobj.user;

import lombok.Data;
import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */

public class UserName extends AbstructUser {
    private String userName;

    UserName(String name) {

        userName = name;
    }

    public String getUserName() {
        return userName;
    }
}
