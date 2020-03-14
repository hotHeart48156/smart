package org.activite.dto.agg;

@Data
public class CouponTypeDto {
    private String ActiviteId;
    private String couponType;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponType(ValueObjectFactory.newInstance(CouponType.class, this.couponType));
    }
}
