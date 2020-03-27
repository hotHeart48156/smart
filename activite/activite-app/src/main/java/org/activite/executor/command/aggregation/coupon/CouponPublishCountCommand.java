package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.CouponPublishCountDto;
@Value
public class CouponPublishCountCommand  extends AbstractCouponCommand{
private CouponPublishCountDto  CouponPublishCountDto;
}
