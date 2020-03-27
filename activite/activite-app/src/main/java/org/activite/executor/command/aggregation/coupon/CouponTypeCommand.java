package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponTypeDto;
@Value
public class CouponTypeCommand  extends AbstractCouponCommand{
private CouponTypeDto  CouponTypeDto;
}
