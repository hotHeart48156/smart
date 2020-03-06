package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.Title;
import org.activite.domain.activite.valueobject.id.Id;
import org.activite.domain.activite.valueobject.is.IsIndex;
import org.activite.domain.activite.valueobject.status.PromotionStatus;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class Promotion {
    @EmbeddedId
    private Id id;
    @Embedded
private  Title title;
    @Embedded
private  StartTime startTime;
    @Embedded
private  EndTime endTime;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  IsIndex isIndex;
    @Embedded
private  PromotionStatus promotionStatus;
}
