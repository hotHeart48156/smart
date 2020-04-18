package org.product.executor.command.aggre.product;

import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductSalesQualitityCommand  extends AbstractProductCommand {
private org.product.dto.aggre.product.ProductSalesQualitityDto ProductSalesQualitityDto;
}
