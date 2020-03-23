package org.activite.dto.agg.coupon;

@Data
public class CouponUserTypeDto {
    private String ActiviteId;
    private String couponUserType;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponUserType(ValueObjectFactory.newInstance(CouponUserType.class, this.couponUserType));
    }
}
