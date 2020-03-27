package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponCountDto;
@Value
public class CouponCountCommand  extends AbstractCouponCommand{
private CouponCountDto  CouponCountDto;
}
