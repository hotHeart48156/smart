package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponNameDto;
@Value
public class CouponNameCommand  extends AbstractCouponCommand{
private CouponNameDto  CouponNameDto;
}
