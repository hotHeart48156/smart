package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.MemberlLevel;
import org.product.domain.valueobject.id.MemberPriceId;
import org.product.domain.valueobject.id.ProductId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Data
@Entity
@Table(name = "memberprice")

public class MemberPrice   implements org.product.domain.entity.Entity {
     @EmbeddedId
    private MemberPriceId memberPriceId;
     @Embedded
    private ProductId productId;
     @Embedded
    private MemberlLevel memberlLevel;
     @Embedded
    private org.product.domain.valueobject.MemberPrice memberPrice;

}
