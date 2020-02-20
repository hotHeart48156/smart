package org.account.domain.account.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.account.domain.account.entity.*;

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
