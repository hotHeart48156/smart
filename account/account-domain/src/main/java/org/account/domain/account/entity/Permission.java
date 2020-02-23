package org.account.domain.account.entity;

import lombok.Data;
import org.account.domain.account.valueobj.PermissionValue;
import org.account.domain.account.valueobj.Pid;
import org.account.domain.account.valueobj.Url;
import org.account.domain.account.valueobj.id.PermissionId;
import org.account.domain.account.valueobj.time.CreateTime;

import javax.swing.*;

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
    private PermissionValue permissionValue;
}
