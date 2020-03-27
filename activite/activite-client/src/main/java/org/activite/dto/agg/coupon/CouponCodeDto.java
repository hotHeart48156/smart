package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.code.CouponCode;

@Data
public class  CouponCodeDto  extends AbstractCouponDto{
private String couponCode;
public void accept(Coupon coupon){
coupon.setCouponCode(ValueObjectFactory.newInstance(CouponCode.class ,this.couponCode));
}
}
