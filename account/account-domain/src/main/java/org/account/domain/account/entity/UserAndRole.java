package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.user.UserRoleId;
import org.account.domain.account.valueobj.user.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class UserAndRole {
    private Long id;
    private UserId userId;
    private UserRoleId roleId;


}
