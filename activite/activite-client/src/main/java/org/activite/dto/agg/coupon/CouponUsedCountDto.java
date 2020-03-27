package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.CouponUsedCount;

@Data
public class  CouponUsedCountDto  extends AbstractCouponDto{
private String couponUsedCount;
public void accept(Coupon coupon){
coupon.setCouponUsedCount(ValueObjectFactory.newInstance(CouponUsedCount.class ,this.couponUsedCount));
}
}
