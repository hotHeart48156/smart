package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.count.CouponPublishCount;

@Data
public class CouponPublishCountDto {
    private String ActiviteId;
    private String couponPublishCount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponPublishCount(ValueObjectFactory.newInstance(CouponPublishCount.class, this.couponPublishCount));
    }
}
