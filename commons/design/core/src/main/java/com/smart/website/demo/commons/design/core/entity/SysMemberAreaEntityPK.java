package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SysMemberAreaEntityPK implements Serializable {
    private long memberId;
    private long objId;

    @Column(name = "member_id", nullable = false)
    @Id
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Column(name = "obj_id", nullable = false)
    @Id
    public long getObjId() {
        return objId;
    }

    public void setObjId(long objId) {
        this.objId = objId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysMemberAreaEntityPK that = (SysMemberAreaEntityPK) o;

        if (memberId != that.memberId) return false;
        return objId == that.objId;
    }

    @Override
    public int hashCode() {
        int result = (int) (memberId ^ (memberId >>> 32));
        result = 31 * result + (int) (objId ^ (objId >>> 32));
        return result;
    }
}
