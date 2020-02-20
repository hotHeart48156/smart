package org.account.domain.account.valueobj.permission;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class CreateTime extends AbstructPermission {
    private Date createTime;

    CreateTime(Date CreateTime) {
        createTime = CreateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
