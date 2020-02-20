package org.account.domain.account.valueobj.store;

import lombok.Data;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@Data
public class StoreTime {
    private Date createTime;

    private Date deleteTime;

    private Date lastLoginTime;

    private Date expireTime;

    private Date tryTime;

}
