package org.activite.dto.entity;

@Data
public class CouponHistoryDto {
    private String couponId;
    private String userId;
    private String couponCode;
    private String userNickName;
    private String couponGetType;
    private String createTime;
    private String couponUseStatus;
    private String couponUseTime;
    private String orderSn;
    private String orderId;
    private String startTime;
    private String endTime;
    private String note;

    public void accept(CouponHistory couponhistory) {
        couponhistory.setCouponId(ValueObjectFactory.newInstance(CouponId.class, couponId));
        couponhistory.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        couponhistory.setCouponCode(ValueObjectFactory.newInstance(CouponCode.class, couponCode));
        couponhistory.setUserNickName(ValueObjectFactory.newInstance(UserNickName.class, userNickName));
        couponhistory.setCouponGetType(ValueObjectFactory.newInstance(CouponGetType.class, couponGetType));
        couponhistory.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        couponhistory.setCouponUseStatus(ValueObjectFactory.newInstance(CouponUseStatus.class, couponUseStatus));
        couponhistory.setCouponUseTime(ValueObjectFactory.newInstance(CouponUseTime.class, couponUseTime));
        couponhistory.setOrderSn(ValueObjectFactory.newInstance(OrderSn.class, orderSn));
        couponhistory.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        couponhistory.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        couponhistory.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        couponhistory.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
