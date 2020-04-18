package org.product.executor.command.aggre.product;

import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductOriginalPriceCommand  extends AbstractProductCommand {
private org.product.dto.aggre.product.ProductOriginalPriceDto ProductOriginalPriceDto;
}
