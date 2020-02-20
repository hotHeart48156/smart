package org.account.domain.account.valueobj.user;

import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */
public class UserEmail extends AbstructUser {
    private String Email;

    UserEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }
}
