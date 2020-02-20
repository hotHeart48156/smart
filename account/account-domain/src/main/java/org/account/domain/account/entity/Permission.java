package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.permission.*;

/**
 * @author "yangbiao"
 */
@Data
public class Permission {
    private CreateTime createTime;
    private Icon icon;
    private PermissionId id;
    private Pid pid;
    private Url url;
    private Value value;
}
