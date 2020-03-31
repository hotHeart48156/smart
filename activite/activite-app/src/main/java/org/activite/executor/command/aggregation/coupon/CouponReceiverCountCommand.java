package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponReceiverCountDto;
@Value
@AllArgsConstructor

public class CouponReceiverCountCommand  extends AbstractCouponCommand{
private CouponReceiverCountDto  CouponReceiverCountDto;
}
