package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.count.AdminCount;
import org.admin.domain.valueobj.id.RoleId;
import org.admin.domain.valueobj.name.RoleName;


/**
 * @author "yangbiao"
 */
@Data
public class Role {
    private RoleId id;
    private AdminCount adminId;
    private RoleName roleName;
    private RoleStatus roleStatus;
    private Description description;
    private AdminCount adminCount;


}
