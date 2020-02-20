package org.account.domain.account.valueobj.store;

import lombok.Data;

/**
 * @author "yangbiao"
 */
@Data
public class StoreStatus {
    private Integer status;

    private Integer isChecked;

    private Integer isDeleted;

    private Integer isStar;

    private Integer isTry;

}
