package org.activite.domain.aggregation;

import lombok.Data;
import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.id.PromotionId;
import org.activite.domain.valueobject.status.PromotionStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Promotion extends AbstractAggregation {
 @EmbeddedId
 private PromotionId promotionId;
 @Embedded
 private Title title;
 @Embedded
 private CreateTime createTime;
 @Embedded
 private EndTime endTime;
 @Embedded
 private PromotionStatus promotionStatus;


}
