package org.activite.dto.agg;

@Data
public class CouponAmountDto {
    private String ActiviteId;
    private String couponAmount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponAmount(ValueObjectFactory.newInstance(CouponAmount.class, this.couponAmount));
    }
}
