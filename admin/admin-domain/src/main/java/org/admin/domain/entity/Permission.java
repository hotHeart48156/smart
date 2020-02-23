package org.admin.domain.entity;

import lombok.Data;
import org.admin.domain.valueobj.PermissionValue;
import org.admin.domain.valueobj.Pid;
import org.admin.domain.valueobj.Url;
import org.admin.domain.valueobj.id.PermissionId;
import org.admin.domain.valueobj.time.CreateTime;

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
