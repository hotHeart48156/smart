package org.activite.domain.valueobject.type;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum CouponType implements Type
{
UNIVERSAL(1),CATEGORY(2),PORDUCT(3);
@Column(name="   couponType")
private  int   couponType;

}
