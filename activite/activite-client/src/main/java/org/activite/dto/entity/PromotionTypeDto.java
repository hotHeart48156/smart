package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.PromotionType;
import org.activite.domain.valueobject.Title;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.is.IsIndex;
import org.activite.domain.valueobject.status.PromotionStatus;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;

import java.sql.Timestamp;

@Data
public class PromotionTypeDto {
    private String id;
    private String title;
    private String startTime;
    private String endTime;
    private Timestamp createTime;
    private int isIndex;
    private String promotionStatus;

    public void accept(PromotionType promotiontype) {
        promotiontype.setId(ValueObjectFactory.newInstance(Id.class, id));
        promotiontype.setTitle(ValueObjectFactory.newInstance(Title.class, title));
        promotiontype.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        promotiontype.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        promotiontype.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        promotiontype.setIsIndex(ValueObjectFactory.newInstance(IsIndex.class, isIndex));
        promotiontype.setPromotionStatus(ValueObjectFactory.newInstance(PromotionStatus.class, promotionStatus));
    }
}
