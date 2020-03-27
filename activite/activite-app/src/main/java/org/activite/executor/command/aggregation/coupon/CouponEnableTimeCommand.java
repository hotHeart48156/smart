package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponEnableTimeDto;
@Value
public class CouponEnableTimeCommand  extends AbstractCouponCommand{
private CouponEnableTimeDto  CouponEnableTimeDto;
}
