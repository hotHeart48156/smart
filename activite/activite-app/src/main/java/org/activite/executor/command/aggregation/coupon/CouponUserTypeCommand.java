package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponUserTypeDto;
@Value
public class CouponUserTypeCommand  extends AbstractCouponCommand{
private CouponUserTypeDto  CouponUserTypeDto;
}
