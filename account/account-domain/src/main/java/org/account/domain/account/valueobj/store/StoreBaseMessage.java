package org.account.domain.account.valueobj.store;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * @author "yangbiao"
 */
@Data
@Setter(AccessLevel.PRIVATE)
public class StoreBaseMessage {
    private Long id;

    private Long uid;


    private String name;


    private Integer type;
    private String description;
    private Long smsQuantity;
    private Integer goodsCount;

    StoreBaseMessage() {
    }

}
