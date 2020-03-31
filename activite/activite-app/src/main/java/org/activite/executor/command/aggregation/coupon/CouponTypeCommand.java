package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponTypeDto;
@Value
@AllArgsConstructor

public class CouponTypeCommand  extends AbstractCouponCommand{
private CouponTypeDto  CouponTypeDto;
}
