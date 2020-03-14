package org.activite.dto.agg;

@Data
public class CouponReceiverCountDto {
    private String ActiviteId;
    private String couponReceiverCount;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setCouponReceiverCount(ValueObjectFactory.newInstance(CouponReceiverCount.class, this.couponReceiverCount));
    }
}
