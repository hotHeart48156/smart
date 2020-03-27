package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponUsedCountDto;
@Value
public class CouponUsedCountCommand  extends AbstractCouponCommand{
private CouponUsedCountDto  CouponUsedCountDto;
}
