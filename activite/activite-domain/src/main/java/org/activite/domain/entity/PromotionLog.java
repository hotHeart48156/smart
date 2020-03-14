package org.activite.domain.entity;

import org.activite.domain.valueobject.Phone;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.time.CreateTime;

/**
 * @author "yangbiao"
 */
public class PromotionLog {
    private Id id;
    private UserId userId;
    private ProductId productId;
    private Phone phone;
    private ProductName productName;
    private CreateTime createTime;
}
