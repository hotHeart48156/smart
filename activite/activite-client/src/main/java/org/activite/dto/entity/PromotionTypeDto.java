package org.activite.dto.entity;

@Data
public class PromotionTypeDto {
    private String id;
    private String title;
    private String startTime;
    private String endTime;
    private String createTime;
    private String isIndex;
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
