package org.activite.dto.agg;

@Data
public class CouponUsedCountDto {
    private String ActiviteId;
    private String couponUsedCount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponUsedCount(ValueObjectFactory.newInstance(CouponUsedCount.class, this.couponUsedCount));
    }
}
