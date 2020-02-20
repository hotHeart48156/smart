package org.account.domain.account.valueobj.user;

import lombok.Data;
import org.account.domain.account.valueobj.ValueObject;

/**
 * @author "yangbiao"
 */

public class UserId extends AbstructUser {
    private Long Id;

    UserId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }
}
