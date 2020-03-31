package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponNameDto;
@Value
@AllArgsConstructor

public class CouponNameCommand  extends AbstractCouponCommand{
private CouponNameDto  CouponNameDto;
}
