package org.activite.domain.activite.valueobject.amount;

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
public class CouponAmount  extends AbstractAmount
{
@Column(name ="   couponAmount")
private  Long   couponAmount;
}
