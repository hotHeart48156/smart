package org.activite.dto.entity;

@Data
public class GiftDto {
    private String giftId;
    private String giftName;
    private String giftStatus;
    private String activityUser;
    private String activityGoods;
    private String giftType;
    private String smallType;
    private String List<GoodsId>
    private String userLevel;
    private String startTime;
    private String endTime;
    private String note;
    private String List<GiftId>

    public void accept(Gift gift) {
        gift.setGiftId(ValueObjectFactory.newInstance(GiftId.class, giftId));
        gift.setGiftName(ValueObjectFactory.newInstance(GiftName.class, giftName));
        gift.setGiftStatus(ValueObjectFactory.newInstance(GiftStatus.class, giftStatus));
        gift.setActivityUser(ValueObjectFactory.newInstance(ActivityUser.class, activityUser));
        gift.setActivityGoods(ValueObjectFactory.newInstance(ActivityGoods.class, activityGoods));
        gift.setGiftType(ValueObjectFactory.newInstance(GiftType.class, giftType));
        gift.setSmallType(ValueObjectFactory.newInstance(SmallType.class, smallType));
        gift.set(ValueObjectFactory.newInstance(. class ,List<GoodsId));
        gift.setUserLevel(ValueObjectFactory.newInstance(UserLevel.class, userLevel));
        gift.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        gift.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        gift.setNote(ValueObjectFactory.newInstance(Note.class, note));
        gift.set(ValueObjectFactory.newInstance(. class ,List<GiftId));
    }
}
