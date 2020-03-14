package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.AppletSet;
import org.users.domain.valueobject.ValueObjectFactory;

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
        appletset.setString(ValueObjectFactory.newInstance(String.class, appid));
        appletset.setString(ValueObjectFactory.newInstance(String.class, appsecret));
        appletset.setString(ValueObjectFactory.newInstance(String.class, mchid));
        appletset.setString(ValueObjectFactory.newInstance(String.class, paySignKey));
        appletset.setString(ValueObjectFactory.newInstance(String.class, certName));
        appletset.setString(ValueObjectFactory.newInstance(String.class, notifyUrl));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId1));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId2));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId3));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId4));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId5));
        appletset.setString(ValueObjectFactory.newInstance(String.class, templateId6));
    }
}
