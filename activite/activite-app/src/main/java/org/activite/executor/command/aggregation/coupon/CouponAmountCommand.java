package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
@Value
public class CouponAmountCommand  extends AbstractCouponCommand{
private org.activite.dto.agg.coupon.CouponAmountDto CouponAmountDto;
}
