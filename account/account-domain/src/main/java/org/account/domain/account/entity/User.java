package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.user.UserRoleId;
import org.account.domain.account.valueobj.user.*;

/**
 * @author "yangbiao"
 */
@Data
public class User {
    private UserId id;
    private UserName userName;
    private UserPassword password;
    private UserEmail email;
    private UserCreateTime createTime;
    private UserLoginTime loginTime;
    private UserNote userNote;
    private UserStatus status;
    private UserRoleId roleId;

}
