package org.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_role_permission", schema = "account", catalog = "")
public class SysRolePermissionEntity {
    private long id;
    private Long roleId;
    private Long permissionId;
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_id", nullable = true)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "permission_id", nullable = true)
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRolePermissionEntity that = (SysRolePermissionEntity) o;

        if (id != that.id) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (permissionId != null ? permissionId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
