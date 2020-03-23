package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.amount.CouponAmount;

@Data
public class CouponAmountDto {
    private String ActiviteId;
    private String couponAmount;

    public void accept(Coupon coupon) {
        coupon.setCouponId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponAmount(ValueObjectFactory.newInstance(CouponAmount.class, this.couponAmount));
    }
}
