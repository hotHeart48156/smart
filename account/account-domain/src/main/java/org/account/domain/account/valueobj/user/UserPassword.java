package org.account.domain.account.valueobj.user;

import lombok.Data;
import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */

public class UserPassword extends AbstructUser {
    private String password;

    UserPassword(String Password) {
        password = Password;
    }

    public String getPassword() {
        return password;
    }
}
