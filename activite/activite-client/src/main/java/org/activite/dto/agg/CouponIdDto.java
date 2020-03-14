package org.activite.dto.agg;

@Data
public class CouponIdDto {
    private String ActiviteId;
    private String couponId;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponId(ValueObjectFactory.newInstance(CouponId.class, this.couponId));
    }
}
