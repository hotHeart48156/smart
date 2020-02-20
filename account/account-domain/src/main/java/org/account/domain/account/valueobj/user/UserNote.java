package org.account.domain.account.valueobj.user;

import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */
public class UserNote extends AbstructUser {
    private String note;

    UserNote(String userNote) {
        note = userNote;
    }

    public String getNote() {
        return note;
    }
}
