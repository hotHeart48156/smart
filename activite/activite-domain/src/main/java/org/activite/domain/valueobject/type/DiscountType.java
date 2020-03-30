package org.activite.domain.valueobject.type;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum DiscountType implements Type
{
    PERCENTAGE(1),AMOUNT(2);
@Column(name ="   discountType")
private  int   discountType;
}
