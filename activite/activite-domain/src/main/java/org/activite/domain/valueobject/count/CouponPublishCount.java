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
public class CouponPublishCount extends AbstractCount
{
@Column(name ="   couponPublishCount")
private  Long   couponPublishCount;
}
