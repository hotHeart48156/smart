package org.activite.dto.agg;

@Data
public class CouponEnableTimeDto {
    private String ActiviteId;
    private String couponEnableTime;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponEnableTime(ValueObjectFactory.newInstance(CouponEnableTime.class, this.couponEnableTime));
    }
}
