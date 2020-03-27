package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
@Value
public class CouponCodeCommand  extends AbstractCouponCommand{
private org.activite.dto.agg.coupon.CouponCodeDto CouponCodeDto;
}
