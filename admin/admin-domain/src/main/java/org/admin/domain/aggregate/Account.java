package org.admin.domain.aggregate;


import lombok.Data;
import org.admin.domain.entity.*;

/**
 * @author "yangbiao"
 */
@Data
public class Account implements Aggregate {
    private User user;
    private Permission permission;
    private Role role;
    private Education education;
    private RoleAndPermission roleAndPermission;
    private UserAndPermission userAndPermission;
    private UserAndRole userAndRole;
}
