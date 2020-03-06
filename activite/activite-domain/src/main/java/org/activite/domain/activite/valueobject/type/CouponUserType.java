package org.activite.domain.activite.valueobject.type;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public enum CouponUserType implements Type
{
@Column(type ="   couponUserType")
private  int   couponUserType;
}
