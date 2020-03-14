package org.activite.domain.aggregation;

import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.id.PromotionId;
import org.activite.domain.valueobject.status.PromotionStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */

public class Promotion {
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
