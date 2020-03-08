package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_message", schema = "account", catalog = "")
public class SysMessageEntity {
    private int id;
    private int userId;
    private String code;
    private String params;
    private String content;
    private long ctime;
    private long utime;
    private byte status;
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 60)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "params", nullable = false, length = 5000)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Basic
    @Column(name = "content", nullable = false, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "ctime", nullable = false)
    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "utime", nullable = false)
    public long getUtime() {
        return utime;
    }

    public void setUtime(long utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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

        SysMessageEntity that = (SysMessageEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (ctime != that.ctime) return false;
        if (utime != that.utime) return false;
        if (status != that.status) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (ctime ^ (ctime >>> 32));
        result = 31 * result + (int) (utime ^ (utime >>> 32));
        result = 31 * result + (int) status;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
