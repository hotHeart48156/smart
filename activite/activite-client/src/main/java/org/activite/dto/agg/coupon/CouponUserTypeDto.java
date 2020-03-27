package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.type.CouponUserType;

@Data
public class  CouponUserTypeDto  extends AbstractCouponDto{
private String couponUserType;
public void accept(Coupon coupon){
coupon.setCouponUserType(ValueObjectFactory.newInstance(CouponUserType.class ,this.couponUserType));
}
}
