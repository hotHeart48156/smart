package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.Title;
import org.activite.domain.activite.valueobject.is.IsIndex;
import org.activite.domain.activite.valueobject.status.PromotionStatus;
import org.activite.domain.activite.valueobject.time.CreateTime;
import org.activite.domain.activite.valueobject.time.EndTime;
import org.activite.domain.activite.valueobject.time.StartTime;

/**
 * @author "yangbiao"
 */
public class Promotion {
    private Title title;
    private StartTime startTime;
    private EndTime endTime;
    private CreateTime createTime;
    private IsIndex isIndex;
    private PromotionStatus promotionStatus;
}
