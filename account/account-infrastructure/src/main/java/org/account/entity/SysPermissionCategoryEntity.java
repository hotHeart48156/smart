package org.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_permission_category", schema = "account", catalog = "")
public class SysPermissionCategoryEntity {
    private long id;
    private String name;
    private String icon;
    private Integer typeCount;
    private Integer showStatus;
    private Integer sort;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = 500)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "type_count", nullable = true)
    public Integer getTypeCount() {
        return typeCount;
    }

    public void setTypeCount(Integer typeCount) {
        this.typeCount = typeCount;
    }

    @Basic
    @Column(name = "show_status", nullable = true)
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

        SysPermissionCategoryEntity that = (SysPermissionCategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (typeCount != null ? !typeCount.equals(that.typeCount) : that.typeCount != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (typeCount != null ? typeCount.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
