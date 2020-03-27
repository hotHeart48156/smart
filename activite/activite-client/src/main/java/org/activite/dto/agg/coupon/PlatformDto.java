package org.activite.dto.agg.coupon;

import lombok.Data;
import org.activite.domain.aggregation.Coupon;
import org.activite.domain.valueobject.Platform;
import org.activite.domain.valueobject.ValueObjectFactory;

@Data
public class  PlatformDto  extends AbstractCouponDto{
private String platform;
public void accept(Coupon coupon){
coupon.setPlatform(ValueObjectFactory.newInstance(Platform.class ,this.platform));
}
}
