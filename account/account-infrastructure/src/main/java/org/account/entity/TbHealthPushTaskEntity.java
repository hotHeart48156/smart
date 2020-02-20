package org.account.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_health_push_task", schema = "account", catalog = "")
public class TbHealthPushTaskEntity {
    private int id;
    private String templateId;
    private String taskName;
    private String taskTopic;
    private String taskCaption;
    private String taskTips;
    private String taskType;
    private Integer status;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsOnlineStatus;
    private BigDecimal price;
    private Integer isUpload;
    private String fileName;
    private Timestamp createTime;
    private Timestamp updateTime;
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
    @Column(name = "template_id", nullable = true, length = 64)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "task_name", nullable = true, length = 64)
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Basic
    @Column(name = "task_topic", nullable = true, length = 64)
    public String getTaskTopic() {
        return taskTopic;
    }

    public void setTaskTopic(String taskTopic) {
        this.taskTopic = taskTopic;
    }

    @Basic
    @Column(name = "task_caption", nullable = true, length = 200)
    public String getTaskCaption() {
        return taskCaption;
    }

    public void setTaskCaption(String taskCaption) {
        this.taskCaption = taskCaption;
    }

    @Basic
    @Column(name = "task_tips", nullable = true, length = 64)
    public String getTaskTips() {
        return taskTips;
    }

    public void setTaskTips(String taskTips) {
        this.taskTips = taskTips;
    }

    @Basic
    @Column(name = "task_type", nullable = true, length = 64)
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 64)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_online_status", nullable = true)
    public Integer getGoodsOnlineStatus() {
        return goodsOnlineStatus;
    }

    public void setGoodsOnlineStatus(Integer goodsOnlineStatus) {
        this.goodsOnlineStatus = goodsOnlineStatus;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "is_upload", nullable = true)
    public Integer getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(Integer isUpload) {
        this.isUpload = isUpload;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = 64)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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

        TbHealthPushTaskEntity that = (TbHealthPushTaskEntity) o;

        if (id != that.id) return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (taskName != null ? !taskName.equals(that.taskName) : that.taskName != null) return false;
        if (taskTopic != null ? !taskTopic.equals(that.taskTopic) : that.taskTopic != null) return false;
        if (taskCaption != null ? !taskCaption.equals(that.taskCaption) : that.taskCaption != null) return false;
        if (taskTips != null ? !taskTips.equals(that.taskTips) : that.taskTips != null) return false;
        if (taskType != null ? !taskType.equals(that.taskType) : that.taskType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsOnlineStatus != null ? !goodsOnlineStatus.equals(that.goodsOnlineStatus) : that.goodsOnlineStatus != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (isUpload != null ? !isUpload.equals(that.isUpload) : that.isUpload != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (taskName != null ? taskName.hashCode() : 0);
        result = 31 * result + (taskTopic != null ? taskTopic.hashCode() : 0);
        result = 31 * result + (taskCaption != null ? taskCaption.hashCode() : 0);
        result = 31 * result + (taskTips != null ? taskTips.hashCode() : 0);
        result = 31 * result + (taskType != null ? taskType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsOnlineStatus != null ? goodsOnlineStatus.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (isUpload != null ? isUpload.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
