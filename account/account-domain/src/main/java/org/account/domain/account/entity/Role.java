package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.role.*;

/**
 * @author "yangbiao"
 */
@Data
public class Role {
    private RoleId id;
    private AdminCount adminId;
    private Name name;
    private Status status;
    private Description description;
    private AdminCount adminCount;


}
