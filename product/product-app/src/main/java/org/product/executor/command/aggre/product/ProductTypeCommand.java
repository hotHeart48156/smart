package org.product.executor.command.aggre.product;

import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductTypeCommand  extends AbstractProductCommand {
private org.product.dto.aggre.product.ProductTypeDto ProductTypeDto;
}
