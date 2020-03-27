package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.PlatformDto;
@Value
public class PlatformCommand  extends AbstractCouponCommand{
private PlatformDto  PlatformDto;
}
