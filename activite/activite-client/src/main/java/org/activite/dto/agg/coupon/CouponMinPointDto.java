package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.CouponMinPoint;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  CouponMinPointDto  extends AbstractCouponDto{
private String couponMinPoint;
public void accept(Coupon coupon){
coupon.setCouponMinPoint(ValueObjectFactory.newInstance(CouponMinPoint.class ,this.couponMinPoint));
}
}
