package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.AppletSet;

@Data
public class AppletSetDto {
    private String appid;
    private String appsecret;
    private String mchid;
    private String paySignKey;
    private String certName;
    private String notifyUrl;
    private String templateId1;
    private String templateId2;
    private String templateId3;
    private String templateId4;
    private String templateId5;
    private String templateId6;

    public void accept(AppletSet appletset) {
        appletset.setMchid(this.mchid);
        appletset.setAppid(appid);
        appletset.setAppsecret(appsecret);
        appletset.setPaySignKey(paySignKey);
        appletset.setCertName(certName);
        appletset.setNotifyUrl(notifyUrl);
        appletset.setTemplateId6(templateId6);
        appletset.setTemplateId5(templateId5);
        appletset.setTemplateId4(templateId4);
        appletset.setTemplateId3(templateId3);
        appletset.setTemplateId2(templateId2);
        appletset.setTemplateId1(templateId1);
    }
}
