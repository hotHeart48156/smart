package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.Email;
import org.account.domain.account.valueobj.Note;
import org.account.domain.account.valueobj.Password;
import org.account.domain.account.valueobj.id.RoleId;
import org.account.domain.account.valueobj.id.UserId;
import org.account.domain.account.valueobj.name.UserName;
import org.account.domain.account.valueobj.status.UserStatus;
import org.account.domain.account.valueobj.time.CreateTime;
import org.account.domain.account.valueobj.time.LoginTime;


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
