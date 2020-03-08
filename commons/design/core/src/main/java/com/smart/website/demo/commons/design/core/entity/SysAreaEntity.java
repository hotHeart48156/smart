package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_area", schema = "account", catalog = "")
public class SysAreaEntity {
    private Long id;
    private Long pid;
    private Integer deep;
    private String name;
    private String pinyinPrefix;
    private String pinyin;
    private String extId;
    private String extName;
    private Integer storeId;

    @Basic
    @Column(name = "id", nullable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pid", nullable = true)
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "deep", nullable = true)
    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pinyin_prefix", nullable = true, length = 255)
    public String getPinyinPrefix() {
        return pinyinPrefix;
    }

    public void setPinyinPrefix(String pinyinPrefix) {
        this.pinyinPrefix = pinyinPrefix;
    }

    @Basic
    @Column(name = "pinyin", nullable = true, length = 255)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Basic
    @Column(name = "ext_id", nullable = true, length = 255)
    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    @Basic
    @Column(name = "ext_name", nullable = true, length = 255)
    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
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

        SysAreaEntity that = (SysAreaEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (deep != null ? !deep.equals(that.deep) : that.deep != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pinyinPrefix != null ? !pinyinPrefix.equals(that.pinyinPrefix) : that.pinyinPrefix != null) return false;
        if (pinyin != null ? !pinyin.equals(that.pinyin) : that.pinyin != null) return false;
        if (extId != null ? !extId.equals(that.extId) : that.extId != null) return false;
        if (extName != null ? !extName.equals(that.extName) : that.extName != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (deep != null ? deep.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pinyinPrefix != null ? pinyinPrefix.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        result = 31 * result + (extId != null ? extId.hashCode() : 0);
        result = 31 * result + (extName != null ? extName.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
