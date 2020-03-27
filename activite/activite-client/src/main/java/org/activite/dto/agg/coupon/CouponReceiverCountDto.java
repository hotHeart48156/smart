package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.CouponReceiverCount;

@Data
public class  CouponReceiverCountDto  extends AbstractCouponDto{
private String couponReceiverCount;
public void accept(Coupon coupon){
coupon.setCouponReceiverCount(ValueObjectFactory.newInstance(CouponReceiverCount.class ,this.couponReceiverCount));
}
}
