package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.Description;
import org.account.domain.account.valueobj.count.AdminCount;
import org.account.domain.account.valueobj.id.RoleId;
import org.account.domain.account.valueobj.name.RoleName;
import org.account.domain.account.valueobj.status.RoleStatus;


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
