package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_member_area", schema = "account", catalog = "")
@IdClass(SysMemberAreaEntityPK.class)
public class SysMemberAreaEntity {
    private long memberId;
    private long objId;
    private String type;
    private Integer storeId;

    @Id
    @Column(name = "member_id", nullable = false)
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Id
    @Column(name = "obj_id", nullable = false)
    public long getObjId() {
        return objId;
    }

    public void setObjId(long objId) {
        this.objId = objId;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
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

        SysMemberAreaEntity that = (SysMemberAreaEntity) o;

        if (memberId != that.memberId) return false;
        if (objId != that.objId) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (memberId ^ (memberId >>> 32));
        result = 31 * result + (int) (objId ^ (objId >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
