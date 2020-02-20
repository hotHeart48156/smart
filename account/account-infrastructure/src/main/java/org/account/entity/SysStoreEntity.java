package org.account.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_store", schema = "account", catalog = "")
public class SysStoreEntity {
    private Long smsQuantity;
    private Short registerType;
    private Timestamp expireTime;
    private Timestamp tryTime;
    private String contactMobile;
    private Long addressProvince;
    private Long buyPlanTimes;
    private Timestamp createTime;
    private Short isChecked;
    private Short isDeleted;
    private String servicePhone;
    private String addressLat;
    private String contactName;
    private Timestamp deleteTime;
    private String diyProfile;
    private Long industryTwo;
    private Short isStar;
    private Short isTry;
    private String logo;
    private String addressDetail;
    private Long planId;
    private String supportName;
    private String name;
    private Short status;
    private Short uid;
    private Integer type;
    private String contactQq;
    private String addressLng;
    private Timestamp lastLoginTime;
    private String supportPhone;
    private Long addressArea;
    private String contactQrcode;
    private String description;
    private Long industryOne;
    private Long addressCity;
    private int id;
    private Integer collect;
    private Integer hit;
    private Integer goodsCount;
    private Integer memberCount;
    private Integer orderCount;
    private Integer payAmount;
    private Integer articleCount;

    @Basic
    @Column(name = "sms_quantity", nullable = true)
    public Long getSmsQuantity() {
        return smsQuantity;
    }

    public void setSmsQuantity(Long smsQuantity) {
        this.smsQuantity = smsQuantity;
    }

    @Basic
    @Column(name = "register_type", nullable = true)
    public Short getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Short registerType) {
        this.registerType = registerType;
    }

    @Basic
    @Column(name = "expire_time", nullable = true)
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "try_time", nullable = true)
    public Timestamp getTryTime() {
        return tryTime;
    }

    public void setTryTime(Timestamp tryTime) {
        this.tryTime = tryTime;
    }

    @Basic
    @Column(name = "contact_mobile", nullable = true, length = 11)
    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    @Basic
    @Column(name = "address_province", nullable = true)
    public Long getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(Long addressProvince) {
        this.addressProvince = addressProvince;
    }

    @Basic
    @Column(name = "buy_plan_times", nullable = true)
    public Long getBuyPlanTimes() {
        return buyPlanTimes;
    }

    public void setBuyPlanTimes(Long buyPlanTimes) {
        this.buyPlanTimes = buyPlanTimes;
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
    @Column(name = "is_checked", nullable = true)
    public Short getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Short isChecked) {
        this.isChecked = isChecked;
    }

    @Basic
    @Column(name = "is_deleted", nullable = true)
    public Short getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "service_phone", nullable = true, length = 30)
    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    @Basic
    @Column(name = "address_lat", nullable = true, length = 40)
    public String getAddressLat() {
        return addressLat;
    }

    public void setAddressLat(String addressLat) {
        this.addressLat = addressLat;
    }

    @Basic
    @Column(name = "contact_name", nullable = true, length = 20)
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Basic
    @Column(name = "delete_time", nullable = true)
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "diy_profile", nullable = true, length = -1)
    public String getDiyProfile() {
        return diyProfile;
    }

    public void setDiyProfile(String diyProfile) {
        this.diyProfile = diyProfile;
    }

    @Basic
    @Column(name = "industry_two", nullable = true)
    public Long getIndustryTwo() {
        return industryTwo;
    }

    public void setIndustryTwo(Long industryTwo) {
        this.industryTwo = industryTwo;
    }

    @Basic
    @Column(name = "is_star", nullable = true)
    public Short getIsStar() {
        return isStar;
    }

    public void setIsStar(Short isStar) {
        this.isStar = isStar;
    }

    @Basic
    @Column(name = "is_try", nullable = true)
    public Short getIsTry() {
        return isTry;
    }

    public void setIsTry(Short isTry) {
        this.isTry = isTry;
    }

    @Basic
    @Column(name = "logo", nullable = true, length = 255)
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "address_detail", nullable = true, length = 100)
    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @Basic
    @Column(name = "plan_id", nullable = true)
    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "support_name", nullable = true, length = 200)
    public String getSupportName() {
        return supportName;
    }

    public void setSupportName(String supportName) {
        this.supportName = supportName;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "uid", nullable = true)
    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
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
    @Column(name = "contact_qq", nullable = true, length = 11)
    public String getContactQq() {
        return contactQq;
    }

    public void setContactQq(String contactQq) {
        this.contactQq = contactQq;
    }

    @Basic
    @Column(name = "address_lng", nullable = true, length = 40)
    public String getAddressLng() {
        return addressLng;
    }

    public void setAddressLng(String addressLng) {
        this.addressLng = addressLng;
    }

    @Basic
    @Column(name = "last_login_time", nullable = true)
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "support_phone", nullable = true, length = 30)
    public String getSupportPhone() {
        return supportPhone;
    }

    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    @Basic
    @Column(name = "address_area", nullable = true)
    public Long getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(Long addressArea) {
        this.addressArea = addressArea;
    }

    @Basic
    @Column(name = "contact_qrcode", nullable = true, length = 255)
    public String getContactQrcode() {
        return contactQrcode;
    }

    public void setContactQrcode(String contactQrcode) {
        this.contactQrcode = contactQrcode;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "industry_one", nullable = true)
    public Long getIndustryOne() {
        return industryOne;
    }

    public void setIndustryOne(Long industryOne) {
        this.industryOne = industryOne;
    }

    @Basic
    @Column(name = "address_city", nullable = true)
    public Long getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(Long addressCity) {
        this.addressCity = addressCity;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "collect", nullable = true)
    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    @Basic
    @Column(name = "hit", nullable = true)
    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    @Basic
    @Column(name = "goods_count", nullable = true)
    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Basic
    @Column(name = "member_count", nullable = true)
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    @Basic
    @Column(name = "order_count", nullable = true)
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    @Basic
    @Column(name = "pay_amount", nullable = true, precision = 0)
    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "article_count", nullable = true)
    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysStoreEntity that = (SysStoreEntity) o;

        if (id != that.id) return false;
        if (smsQuantity != null ? !smsQuantity.equals(that.smsQuantity) : that.smsQuantity != null) return false;
        if (registerType != null ? !registerType.equals(that.registerType) : that.registerType != null) return false;
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) return false;
        if (tryTime != null ? !tryTime.equals(that.tryTime) : that.tryTime != null) return false;
        if (contactMobile != null ? !contactMobile.equals(that.contactMobile) : that.contactMobile != null)
            return false;
        if (addressProvince != null ? !addressProvince.equals(that.addressProvince) : that.addressProvince != null)
            return false;
        if (buyPlanTimes != null ? !buyPlanTimes.equals(that.buyPlanTimes) : that.buyPlanTimes != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (isChecked != null ? !isChecked.equals(that.isChecked) : that.isChecked != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (servicePhone != null ? !servicePhone.equals(that.servicePhone) : that.servicePhone != null) return false;
        if (addressLat != null ? !addressLat.equals(that.addressLat) : that.addressLat != null) return false;
        if (contactName != null ? !contactName.equals(that.contactName) : that.contactName != null) return false;
        if (deleteTime != null ? !deleteTime.equals(that.deleteTime) : that.deleteTime != null) return false;
        if (diyProfile != null ? !diyProfile.equals(that.diyProfile) : that.diyProfile != null) return false;
        if (industryTwo != null ? !industryTwo.equals(that.industryTwo) : that.industryTwo != null) return false;
        if (isStar != null ? !isStar.equals(that.isStar) : that.isStar != null) return false;
        if (isTry != null ? !isTry.equals(that.isTry) : that.isTry != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (addressDetail != null ? !addressDetail.equals(that.addressDetail) : that.addressDetail != null)
            return false;
        if (planId != null ? !planId.equals(that.planId) : that.planId != null) return false;
        if (supportName != null ? !supportName.equals(that.supportName) : that.supportName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (contactQq != null ? !contactQq.equals(that.contactQq) : that.contactQq != null) return false;
        if (addressLng != null ? !addressLng.equals(that.addressLng) : that.addressLng != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;
        if (supportPhone != null ? !supportPhone.equals(that.supportPhone) : that.supportPhone != null) return false;
        if (addressArea != null ? !addressArea.equals(that.addressArea) : that.addressArea != null) return false;
        if (contactQrcode != null ? !contactQrcode.equals(that.contactQrcode) : that.contactQrcode != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (industryOne != null ? !industryOne.equals(that.industryOne) : that.industryOne != null) return false;
        if (addressCity != null ? !addressCity.equals(that.addressCity) : that.addressCity != null) return false;
        if (collect != null ? !collect.equals(that.collect) : that.collect != null) return false;
        if (hit != null ? !hit.equals(that.hit) : that.hit != null) return false;
        if (goodsCount != null ? !goodsCount.equals(that.goodsCount) : that.goodsCount != null) return false;
        if (memberCount != null ? !memberCount.equals(that.memberCount) : that.memberCount != null) return false;
        if (orderCount != null ? !orderCount.equals(that.orderCount) : that.orderCount != null) return false;
        if (payAmount != null ? !payAmount.equals(that.payAmount) : that.payAmount != null) return false;
        if (articleCount != null ? !articleCount.equals(that.articleCount) : that.articleCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = smsQuantity != null ? smsQuantity.hashCode() : 0;
        result = 31 * result + (registerType != null ? registerType.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        result = 31 * result + (tryTime != null ? tryTime.hashCode() : 0);
        result = 31 * result + (contactMobile != null ? contactMobile.hashCode() : 0);
        result = 31 * result + (addressProvince != null ? addressProvince.hashCode() : 0);
        result = 31 * result + (buyPlanTimes != null ? buyPlanTimes.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isChecked != null ? isChecked.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (servicePhone != null ? servicePhone.hashCode() : 0);
        result = 31 * result + (addressLat != null ? addressLat.hashCode() : 0);
        result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
        result = 31 * result + (deleteTime != null ? deleteTime.hashCode() : 0);
        result = 31 * result + (diyProfile != null ? diyProfile.hashCode() : 0);
        result = 31 * result + (industryTwo != null ? industryTwo.hashCode() : 0);
        result = 31 * result + (isStar != null ? isStar.hashCode() : 0);
        result = 31 * result + (isTry != null ? isTry.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (addressDetail != null ? addressDetail.hashCode() : 0);
        result = 31 * result + (planId != null ? planId.hashCode() : 0);
        result = 31 * result + (supportName != null ? supportName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (contactQq != null ? contactQq.hashCode() : 0);
        result = 31 * result + (addressLng != null ? addressLng.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (supportPhone != null ? supportPhone.hashCode() : 0);
        result = 31 * result + (addressArea != null ? addressArea.hashCode() : 0);
        result = 31 * result + (contactQrcode != null ? contactQrcode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (industryOne != null ? industryOne.hashCode() : 0);
        result = 31 * result + (addressCity != null ? addressCity.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (collect != null ? collect.hashCode() : 0);
        result = 31 * result + (hit != null ? hit.hashCode() : 0);
        result = 31 * result + (goodsCount != null ? goodsCount.hashCode() : 0);
        result = 31 * result + (memberCount != null ? memberCount.hashCode() : 0);
        result = 31 * result + (orderCount != null ? orderCount.hashCode() : 0);
        result = 31 * result + (payAmount != null ? payAmount.hashCode() : 0);
        result = 31 * result + (articleCount != null ? articleCount.hashCode() : 0);
        return result;
    }
}
