package org.product.domain.valueobject.price;

import javax.persistence.Column;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
@Embeddable
public class ProductPromotionPrice extends AbstractPrice
{
@Column(name ="   productPromotionPrice")
private BigDecimal productPromotionPrice;
}
