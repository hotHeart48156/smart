package org.activite.domain.entity;

import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.is.IsIndex;
import org.activite.domain.valueobject.status.PromotionStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class PromotionType {
    @EmbeddedId
    private Id id;
    @Embedded
private Title title;
    @Embedded
private StartTime startTime;
    @Embedded
private EndTime endTime;
    @Embedded
private CreateTime createTime;
    @Embedded
private IsIndex isIndex;
    @Embedded
private PromotionStatus promotionStatus;
}
