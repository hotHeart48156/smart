package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponMinPointDto;
@Value
public class CouponMinPointCommand  extends AbstractCouponCommand{
private CouponMinPointDto  CouponMinPointDto;
}
