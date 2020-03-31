package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.CouponPublishCountDto;
@Value
@AllArgsConstructor

public class CouponPublishCountCommand  extends AbstractCouponCommand{
private CouponPublishCountDto  CouponPublishCountDto;
}
