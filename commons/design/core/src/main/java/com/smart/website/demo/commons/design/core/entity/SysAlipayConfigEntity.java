package com.smart.website.demo.commons.design.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_alipay_config", schema = "account", catalog = "")
public class SysAlipayConfigEntity {
    private long id;
    private String appId;
    private String charset;
    private String format;
    private String gatewayUrl;
    private String notifyUrl;
    private String privateKey;
    private String publicKey;
    private String returnUrl;
    private String signType;
    private String sysServiceProviderId;
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
    @Column(name = "app_id", nullable = true, length = 255)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "charset", nullable = true, length = 255)
    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    @Basic
    @Column(name = "format", nullable = true, length = 255)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "gateway_url", nullable = true, length = 255)
    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    @Basic
    @Column(name = "notify_url", nullable = true, length = 255)
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Basic
    @Column(name = "private_key", nullable = true, length = -1)
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Basic
    @Column(name = "public_key", nullable = true, length = -1)
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Basic
    @Column(name = "return_url", nullable = true, length = 255)
    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    @Basic
    @Column(name = "sign_type", nullable = true, length = 255)
    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    @Basic
    @Column(name = "sys_service_provider_id", nullable = true, length = 255)
    public String getSysServiceProviderId() {
        return sysServiceProviderId;
    }

    public void setSysServiceProviderId(String sysServiceProviderId) {
        this.sysServiceProviderId = sysServiceProviderId;
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

        SysAlipayConfigEntity that = (SysAlipayConfigEntity) o;

        if (id != that.id) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (charset != null ? !charset.equals(that.charset) : that.charset != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (gatewayUrl != null ? !gatewayUrl.equals(that.gatewayUrl) : that.gatewayUrl != null) return false;
        if (notifyUrl != null ? !notifyUrl.equals(that.notifyUrl) : that.notifyUrl != null) return false;
        if (privateKey != null ? !privateKey.equals(that.privateKey) : that.privateKey != null) return false;
        if (publicKey != null ? !publicKey.equals(that.publicKey) : that.publicKey != null) return false;
        if (returnUrl != null ? !returnUrl.equals(that.returnUrl) : that.returnUrl != null) return false;
        if (signType != null ? !signType.equals(that.signType) : that.signType != null) return false;
        if (sysServiceProviderId != null ? !sysServiceProviderId.equals(that.sysServiceProviderId) : that.sysServiceProviderId != null)
            return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (charset != null ? charset.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (gatewayUrl != null ? gatewayUrl.hashCode() : 0);
        result = 31 * result + (notifyUrl != null ? notifyUrl.hashCode() : 0);
        result = 31 * result + (privateKey != null ? privateKey.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (returnUrl != null ? returnUrl.hashCode() : 0);
        result = 31 * result + (signType != null ? signType.hashCode() : 0);
        result = 31 * result + (sysServiceProviderId != null ? sysServiceProviderId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
