package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.CouponHistory;
import org.activite.domain.valueobject.Note;
import org.activite.domain.valueobject.OrderSn;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.Id;
import org.activite.domain.valueobject.id.OrderId;
import org.activite.domain.valueobject.id.UserId;
import org.activite.domain.valueobject.name.UserNickName;
import org.activite.domain.valueobject.status.CouponUseStatus;
import org.activite.domain.valueobject.time.CouponUseTime;
import org.activite.domain.valueobject.time.CreateTime;
import org.activite.domain.valueobject.time.EndTime;
import org.activite.domain.valueobject.time.StartTime;
import org.activite.domain.valueobject.type.CouponGetType;

import java.sql.Timestamp;

@Data
public class CouponHistoryDto {
    private String couponId;
    private String userId;
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
        couponhistory.setCouponId(ValueObjectFactory.newInstance(Id.class, this.couponId));
        couponhistory.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        couponhistory.setUserNickName(ValueObjectFactory.newInstance(UserNickName.class, userNickName));
        couponhistory.setCouponGetType(ValueObjectFactory.newInstance(CouponGetType.class, couponGetType));
        couponhistory.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, new Timestamp()));
        couponhistory.setCouponUseStatus(ValueObjectFactory.newInstance(CouponUseStatus.class, couponUseStatus));
        couponhistory.setCouponUseTime(ValueObjectFactory.newInstance(CouponUseTime.class, couponUseTime));
        couponhistory.setOrderSn(ValueObjectFactory.newInstance(OrderSn.class, orderSn));
        couponhistory.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        couponhistory.setStartTime(ValueObjectFactory.newInstance(StartTime.class, startTime));
        couponhistory.setEndTime(ValueObjectFactory.newInstance(EndTime.class, endTime));
        couponhistory.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
