package org.activite.dto.agg.coupon;

@Data
public class CouponMinPointDto {
    private String ActiviteId;
    private String couponMinPoint;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponMinPoint(ValueObjectFactory.newInstance(CouponMinPoint.class, this.couponMinPoint));
    }
}
