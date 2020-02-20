package org.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_user_permission", schema = "account", catalog = "")
public class SysUserPermissionEntity {
    private long id;
    private Long adminId;
    private Long permissionId;
    private Integer type;
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
    @Column(name = "admin_id", nullable = true)
    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

        SysUserPermissionEntity that = (SysUserPermissionEntity) o;

        if (id != that.id) return false;
        if (adminId != null ? !adminId.equals(that.adminId) : that.adminId != null) return false;
        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (adminId != null ? adminId.hashCode() : 0);
        result = 31 * result + (permissionId != null ? permissionId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
