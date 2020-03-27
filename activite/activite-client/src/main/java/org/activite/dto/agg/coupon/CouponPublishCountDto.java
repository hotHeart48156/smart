package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.CouponPublishCount;

@Data
public class  CouponPublishCountDto  extends AbstractCouponDto{
private String couponPublishCount;
public void accept(Coupon coupon){
coupon.setCouponPublishCount(ValueObjectFactory.newInstance(CouponPublishCount.class ,this.couponPublishCount));
}
}
