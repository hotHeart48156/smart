package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponReceiverCountDto;
@Value
public class CouponReceiverCountCommand  extends AbstractCouponCommand{
private CouponReceiverCountDto  CouponReceiverCountDto;
}
