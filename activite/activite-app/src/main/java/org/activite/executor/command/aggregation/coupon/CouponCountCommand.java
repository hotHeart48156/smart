package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponCountDto;
@Value
@AllArgsConstructor

public class CouponCountCommand  extends AbstractCouponCommand{
private CouponCountDto  CouponCountDto;
}
