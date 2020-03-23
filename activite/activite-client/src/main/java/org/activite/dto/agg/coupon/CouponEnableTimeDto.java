package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.time.CouponEnableTime;

@Data
public class CouponEnableTimeDto {
    private String ActiviteId;
    private String couponEnableTime;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponEnableTime(ValueObjectFactory.newInstance(CouponEnableTime.class, this.couponEnableTime));
    }
}
