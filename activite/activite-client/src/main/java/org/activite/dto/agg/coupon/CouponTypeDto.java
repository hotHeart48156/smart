package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.type.CouponType;

@Data
public class  CouponTypeDto  extends AbstractCouponDto{
private String couponType;
public void accept(Coupon coupon){
coupon.setCouponType(ValueObjectFactory.newInstance(CouponType.class ,this.couponType));
}
}
