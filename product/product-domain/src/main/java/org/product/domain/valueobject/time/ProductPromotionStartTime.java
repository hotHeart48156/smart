package org.product.domain.valueobject.time;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
import java.sql.Timestamp;

import java.sql.Timestamp;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductPromotionStartTime extends AbstractTime
{
@Column(name ="   productPromotionStartTime")
private Timestamp productPromotionStartTime;
}
