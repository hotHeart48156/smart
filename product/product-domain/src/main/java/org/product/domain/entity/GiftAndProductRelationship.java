package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.GiftId;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author yangbiao
 */
@Entity
@Data
@Table(name = "giftAndProductRelationship")

public class GiftAndProductRelationship   implements  org.product.domain.entity.Entity{
    @EmbeddedId
    private Id id;
    @Embedded
    private GiftId giftId;
    @Embedded
    private ProductId productId;

}
