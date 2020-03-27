package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.name.CouponName;

@Data
public class  CouponNameDto  extends AbstractCouponDto{
private String couponName;
public void accept(Coupon coupon){
coupon.setCouponName(ValueObjectFactory.newInstance(CouponName.class ,this.couponName));
}
}
