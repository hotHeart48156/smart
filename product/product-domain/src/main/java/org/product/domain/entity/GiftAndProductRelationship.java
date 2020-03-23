package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author yangbiao
 */
@Entity
@Data
public class GiftAndProductRelationship {
    @EmbeddedId
    private Id id;
    @Embedded
    private Id giftId;
    @Embedded
    private ProductId productId;

}
