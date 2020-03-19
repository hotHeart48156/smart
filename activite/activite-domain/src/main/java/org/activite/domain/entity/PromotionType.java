package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.is.IsIndex;
import org.activite.domain.valueobject.status.PromotionStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data

public class PromotionType  extends AbstractEntity{
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
