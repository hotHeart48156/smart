package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponUsedCountDto;
@Value
@AllArgsConstructor

public class CouponUsedCountCommand  extends AbstractCouponCommand{
private CouponUsedCountDto  CouponUsedCountDto;
}
