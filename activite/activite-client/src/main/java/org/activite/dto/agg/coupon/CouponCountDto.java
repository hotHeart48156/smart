package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.CouponCount;

@Data
public class  CouponCountDto  extends AbstractCouponDto{
private String couponCount;
public void accept(Coupon coupon){
coupon.setCouponCount(ValueObjectFactory.newInstance(CouponCount.class ,this.couponCount));
}
}
