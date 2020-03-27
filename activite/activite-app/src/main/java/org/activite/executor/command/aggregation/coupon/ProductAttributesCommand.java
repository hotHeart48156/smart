package  org.activite.executor.command.aggregation.coupon;

import lombok.Value;
import org.activite.dto.agg.coupon.ProductAttributesDto;
@Value
public class ProductAttributesCommand  extends AbstractCouponCommand{
private ProductAttributesDto  ProductAttributesDto;
}
