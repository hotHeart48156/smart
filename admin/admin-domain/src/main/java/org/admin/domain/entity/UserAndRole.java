package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.id.RoleId;
import org.admin.domain.valueobj.id.UserId;


/**
 * @author "yangbiao"
 */
@Data
public class UserAndRole {
    private Long id;
    private UserId userId;
    private RoleId roleId;


}
