package org.product.domain.valueobject.price;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;

import javax.persistence.Column;

import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */

@Value
@AllArgsConstructor
@Embeddable
public class FullPrice extends AbstractPrice
{
@Column(name ="   fullPrice")
private BigDecimal    fullPrice;
}
