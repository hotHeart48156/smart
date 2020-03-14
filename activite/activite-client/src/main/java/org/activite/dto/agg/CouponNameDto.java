package org.activite.dto.agg;

@Data
public class CouponNameDto {
    private String ActiviteId;
    private String couponName;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponName(ValueObjectFactory.newInstance(CouponName.class, this.couponName));
    }
}
