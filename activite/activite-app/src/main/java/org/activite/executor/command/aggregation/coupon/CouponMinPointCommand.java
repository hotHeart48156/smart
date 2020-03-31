package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponMinPointDto;
@Value
@AllArgsConstructor

public class CouponMinPointCommand  extends AbstractCouponCommand{
private CouponMinPointDto  CouponMinPointDto;
}
