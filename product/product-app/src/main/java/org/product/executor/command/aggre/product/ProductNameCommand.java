package org.product.executor.command.aggre.product;

import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductNameCommand  extends AbstractProductCommand {
private org.product.dto.aggre.product.ProductNameDto ProductNameDto;
}
