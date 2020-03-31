package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
@Value
@AllArgsConstructor

public class CouponCodeCommand  extends AbstractCouponCommand{
private org.activite.dto.agg.coupon.CouponCodeDto CouponCodeDto;
}
