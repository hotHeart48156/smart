package org.activite.dto.agg;

@Data
public class PlatformDto {
    private String ActiviteId;
    private String platform;

    public void accept(Coupon coupon) {
        coupon.setActiviteId(ValueObjectFactory.newInstance(ActiviteId.class, this.ActiviteId));
        coupon.setPlatform(ValueObjectFactory.newInstance(Platform.class, this.platform));
    }
}
