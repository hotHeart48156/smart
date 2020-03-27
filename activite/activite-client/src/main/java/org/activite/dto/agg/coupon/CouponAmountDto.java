package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.amount.CouponAmount;

@Data
public class  CouponAmountDto  extends AbstractCouponDto{
private String couponAmount;
public void accept(Coupon coupon){
coupon.setCouponAmount(ValueObjectFactory.newInstance(CouponAmount.class ,this.couponAmount));
}
}
