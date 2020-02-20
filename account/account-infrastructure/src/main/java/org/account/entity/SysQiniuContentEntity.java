package org.account.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_qiniu_content", schema = "account", catalog = "")
public class SysQiniuContentEntity {
    private long id;
    private String bucket;
    private String name;
    private String size;
    private String type;
    private Timestamp updateTime;
    private String url;
    private String suffix;
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
    @Column(name = "bucket", nullable = true, length = 255)
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
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
    @Column(name = "size", nullable = true, length = 255)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "suffix", nullable = true, length = 255)
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

        SysQiniuContentEntity that = (SysQiniuContentEntity) o;

        if (id != that.id) return false;
        if (bucket != null ? !bucket.equals(that.bucket) : that.bucket != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (bucket != null ? bucket.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
