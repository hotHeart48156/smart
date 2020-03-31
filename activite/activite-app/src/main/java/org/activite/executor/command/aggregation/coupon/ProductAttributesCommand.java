package  org.activite.executor.command.aggregation.coupon;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.dto.agg.coupon.ProductAttributesDto;
@Value
@AllArgsConstructor

public class ProductAttributesCommand  extends AbstractCouponCommand{
private ProductAttributesDto  ProductAttributesDto;
}
