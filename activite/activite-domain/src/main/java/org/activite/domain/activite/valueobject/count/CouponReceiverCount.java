package org.activite.domain.activite.valueobject.count;

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
public class CouponReceiverCount extends AbstractCount
{
@Column(name ="   couponReceiverCount")
private  Long   couponReceiverCount;
}
