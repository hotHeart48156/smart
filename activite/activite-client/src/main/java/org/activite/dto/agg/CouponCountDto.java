package org.activite.dto.agg;

@Data
public class CouponCountDto {
    private String ActiviteId;
    private String couponCount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponCount(ValueObjectFactory.newInstance(CouponCount.class, this.couponCount));
    }
}
