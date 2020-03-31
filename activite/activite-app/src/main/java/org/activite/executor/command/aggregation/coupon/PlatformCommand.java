package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.PlatformDto;
@Value
@AllArgsConstructor

public class PlatformCommand  extends AbstractCouponCommand{
private PlatformDto  PlatformDto;
}
