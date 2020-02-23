package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.id.RoleId;
import org.account.domain.account.valueobj.id.UserId;


/**
 * @author "yangbiao"
 */
@Data
public class UserAndRole {
    private Long id;
    private UserId userId;
    private RoleId roleId;


}
