package org.account.gateway.build;

import org.account.domain.account.entity.Permission;
import org.account.domain.account.valueobj.permission.*;
import org.account.entity.SysPermissionEntity;

import java.sql.Timestamp;

/**
 * @author "yangbiao"
 */
public class PermissionBuild implements org.account.domain.gateway.build.PermissionBuild {
    @Override
    public Permission toPermission(Object permissionDo) {

        return null;
    }

    public Permission toPermission(SysPermissionEntity sysPermissionEntity) {
        Permission permission = new Permission();
        permission.setCreateTime(PermissionFactory.createPermissionObject(CreateTime.class, sysPermissionEntity.getCreateTime()));
        permission.setId(PermissionFactory.createPermissionObject(PermissionId.class, sysPermissionEntity.getId()));
        permission.setPid(PermissionFactory.createPermissionObject(Pid.class, sysPermissionEntity.getPid()));
        permission.setIcon(PermissionFactory.createPermissionObject(Icon.class, sysPermissionEntity.getIcon()));
        permission.setUrl(PermissionFactory.createPermissionObject(Url.class, sysPermissionEntity.getUri()));
        permission.setValue(PermissionFactory.createPermissionObject(Value.class, sysPermissionEntity.getValue()));

        return permission;
    }

    public SysPermissionEntity toPermissionEntity(Permission permission) {
        SysPermissionEntity sysPermissionEntity = new SysPermissionEntity();
        sysPermissionEntity.setCreateTime((Timestamp) permission.getCreateTime().getCreateTime());
        sysPermissionEntity.setIcon(permission.getIcon().getIcon());
        sysPermissionEntity.setPid(permission.getPid().getPid());
        return sysPermissionEntity;
    }

}
