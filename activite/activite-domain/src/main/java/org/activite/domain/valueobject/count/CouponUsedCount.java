package org.activite.domain.valueobject.count;

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
public class CouponUsedCount extends AbstractCount
{
@Column(name ="   couponUsedCount")
private  Long   couponUsedCount;
}
