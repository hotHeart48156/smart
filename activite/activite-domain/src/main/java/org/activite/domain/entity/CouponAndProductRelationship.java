package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.ProductSn;
import org.activite.domain.valueobject.id.CouponId;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Entity
@Data
@Table(name = "smart.CouponAndProductRelationship")
public class CouponAndProductRelationship extends AbstractEntity {
 @EmbeddedId
private Id id;
 @Embedded
private CouponId couponId;
 @Embedded
private ProductId productId;
 @Embedded
private ProductName productName;
 @Embedded
private ProductSn productSn;
}
