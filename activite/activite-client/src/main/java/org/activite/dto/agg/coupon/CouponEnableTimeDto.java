package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.CouponEnableTime;

@Data
public class  CouponEnableTimeDto  extends AbstractCouponDto{
private String couponEnableTime;
public void accept(Coupon coupon){
coupon.setCouponEnableTime(ValueObjectFactory.newInstance(CouponEnableTime.class ,this.couponEnableTime));
}
}
