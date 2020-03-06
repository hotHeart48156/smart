package org.product.domain.valueobject.time;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
import java.sql.Timestamp;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductPromotionPerLimit extends AbstractTime
{
@Column(name ="   productPromotionPerLimit")
private  Timestamp   productPromotionPerLimit;
}
