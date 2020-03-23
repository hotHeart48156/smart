package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.MemberlLevel;
import org.product.domain.valueobject.id.MemberPriceId;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Data
@Entity
public class MemberPrice {
     @EmbeddedId
    private MemberPriceId memberPriceId;
     @Embedded
    private ProductId productId;
     @Embedded
    private MemberlLevel memberlLevel;
     @Embedded
    private MemberPrice memberPrice;

}
