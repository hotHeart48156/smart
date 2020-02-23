package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.RoleId;
import org.admin.domain.valueobj.id.UserId;
import org.admin.domain.valueobj.name.UserName;
import org.admin.domain.valueobj.status.UserStatus;
import org.admin.domain.valueobj.time.CreateTime;
import org.admin.domain.valueobj.time.LoginTime;


/**
 * @author "yangbiao"
 */
@Data
public class User {
    private UserId id;
    private UserName userName;
    private Password password;
    private Email email;
    private CreateTime createTime;
    private LoginTime loginTime;
    private Note note;
    private UserStatus status;
    private RoleId roleId;

}
