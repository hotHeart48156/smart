package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.id.UserId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class ProductConsult   implements org.product.domain.entity.Entity{
     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private ProductName productName;
     @Embedded
    private UserId memberId;
     @Embedded
    private MemberName memberName;

}
