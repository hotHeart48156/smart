package org.users.domain.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * @author "yangbiao"
 */
@Data
@javax.persistence.Entity

public class AppletSet implements Entity {
    @Id
    private String appid;

    private String appsecret;

    private String mchid;

    private String paySignKey;

    private String certName;

    private String notifyUrl;

    /**
     * 下单通知模版
     */
    private String templateId1;

    /**
     * 支付成功模版
     */
    private String templateId2;

    private String templateId3;

    private String templateId4;

    private String templateId5;

    private String templateId6;

}
