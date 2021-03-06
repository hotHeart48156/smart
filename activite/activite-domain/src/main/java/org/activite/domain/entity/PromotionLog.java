package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.Phone;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.time.CreateTime;

import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name  ="smart.promotion_log")

public class PromotionLog extends Entity {
    private Id id;
    private UserId userId;
    private ProductId productId;
    private Phone phone;
    private ProductName productName;
    private CreateTime createTime;
}
