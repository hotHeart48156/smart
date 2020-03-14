package org.activite.dto.agg;

@Data
public class CouponPublishCountDto {
    private String ActiviteId;
    private String couponPublishCount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponPublishCount(ValueObjectFactory.newInstance(CouponPublishCount.class, this.couponPublishCount));
    }
}
