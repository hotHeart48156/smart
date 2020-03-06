package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.Title;
import org.activite.domain.activite.valueobject.is.IsIndex;
import org.activite.domain.activite.valueobject.status.PromotionStatus;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;

import javax.persistence.Embedded;

/**
 * @author "yangbiao"
 */
public class Promotion {
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
