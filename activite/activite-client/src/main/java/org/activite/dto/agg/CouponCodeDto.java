package org.activite.dto.agg;

@Data
public class CouponCodeDto {
    private String ActiviteId;
    private String couponCode;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponCode(ValueObjectFactory.newInstance(CouponCode.class, this.couponCode));
    }
}
