package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_applet_set", schema = "account", catalog = "")
public class SysAppletSetEntity {
    private String appid;
    private String appsecret;
    private String mchid;
    private String paySignKey;
    private String certname;
    private String notifyurl;
    private String templateid1;
    private String templateid2;
    private String templateid3;
    private String templateid4;
    private String templateid5;
    private String templateid6;
    private long storeId;

    @Basic
    @Column(name = "appid", nullable = false, length = 255)
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "appsecret", nullable = true, length = 255)
    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    @Basic
    @Column(name = "mchid", nullable = true, length = 255)
    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    @Basic
    @Column(name = "pay_sign_key", nullable = true, length = 255)
    public String getPaySignKey() {
        return paySignKey;
    }

    public void setPaySignKey(String paySignKey) {
        this.paySignKey = paySignKey;
    }

    @Basic
    @Column(name = "certname", nullable = true, length = 255)
    public String getCertname() {
        return certname;
    }

    public void setCertname(String certname) {
        this.certname = certname;
    }

    @Basic
    @Column(name = "notifyurl", nullable = true, length = 255)
    public String getNotifyurl() {
        return notifyurl;
    }

    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl;
    }

    @Basic
    @Column(name = "templateid1", nullable = true, length = 255)
    public String getTemplateid1() {
        return templateid1;
    }

    public void setTemplateid1(String templateid1) {
        this.templateid1 = templateid1;
    }

    @Basic
    @Column(name = "templateid2", nullable = true, length = 255)
    public String getTemplateid2() {
        return templateid2;
    }

    public void setTemplateid2(String templateid2) {
        this.templateid2 = templateid2;
    }

    @Basic
    @Column(name = "templateid3", nullable = true, length = 255)
    public String getTemplateid3() {
        return templateid3;
    }

    public void setTemplateid3(String templateid3) {
        this.templateid3 = templateid3;
    }

    @Basic
    @Column(name = "templateid4", nullable = true, length = 255)
    public String getTemplateid4() {
        return templateid4;
    }

    public void setTemplateid4(String templateid4) {
        this.templateid4 = templateid4;
    }

    @Basic
    @Column(name = "templateid5", nullable = true, length = 255)
    public String getTemplateid5() {
        return templateid5;
    }

    public void setTemplateid5(String templateid5) {
        this.templateid5 = templateid5;
    }

    @Basic
    @Column(name = "templateid6", nullable = true, length = 255)
    public String getTemplateid6() {
        return templateid6;
    }

    public void setTemplateid6(String templateid6) {
        this.templateid6 = templateid6;
    }

    @Id
    @Column(name = "store_id", nullable = false)
    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysAppletSetEntity that = (SysAppletSetEntity) o;

        if (storeId != that.storeId) return false;
        if (appid != null ? !appid.equals(that.appid) : that.appid != null) return false;
        if (appsecret != null ? !appsecret.equals(that.appsecret) : that.appsecret != null) return false;
        if (mchid != null ? !mchid.equals(that.mchid) : that.mchid != null) return false;
        if (paySignKey != null ? !paySignKey.equals(that.paySignKey) : that.paySignKey != null) return false;
        if (certname != null ? !certname.equals(that.certname) : that.certname != null) return false;
        if (notifyurl != null ? !notifyurl.equals(that.notifyurl) : that.notifyurl != null) return false;
        if (templateid1 != null ? !templateid1.equals(that.templateid1) : that.templateid1 != null) return false;
        if (templateid2 != null ? !templateid2.equals(that.templateid2) : that.templateid2 != null) return false;
        if (templateid3 != null ? !templateid3.equals(that.templateid3) : that.templateid3 != null) return false;
        if (templateid4 != null ? !templateid4.equals(that.templateid4) : that.templateid4 != null) return false;
        if (templateid5 != null ? !templateid5.equals(that.templateid5) : that.templateid5 != null) return false;
        return templateid6 != null ? templateid6.equals(that.templateid6) : that.templateid6 == null;
    }

    @Override
    public int hashCode() {
        int result = appid != null ? appid.hashCode() : 0;
        result = 31 * result + (appsecret != null ? appsecret.hashCode() : 0);
        result = 31 * result + (mchid != null ? mchid.hashCode() : 0);
        result = 31 * result + (paySignKey != null ? paySignKey.hashCode() : 0);
        result = 31 * result + (certname != null ? certname.hashCode() : 0);
        result = 31 * result + (notifyurl != null ? notifyurl.hashCode() : 0);
        result = 31 * result + (templateid1 != null ? templateid1.hashCode() : 0);
        result = 31 * result + (templateid2 != null ? templateid2.hashCode() : 0);
        result = 31 * result + (templateid3 != null ? templateid3.hashCode() : 0);
        result = 31 * result + (templateid4 != null ? templateid4.hashCode() : 0);
        result = 31 * result + (templateid5 != null ? templateid5.hashCode() : 0);
        result = 31 * result + (templateid6 != null ? templateid6.hashCode() : 0);
        result = 31 * result + (int) (storeId ^ (storeId >>> 32));
        return result;
    }
}
