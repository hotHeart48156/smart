package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponEnableTimeDto;
@Value
@AllArgsConstructor

public class CouponEnableTimeCommand  extends AbstractCouponCommand{
private CouponEnableTimeDto  CouponEnableTimeDto;
}
