package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.dto.aggre.product.ProductCategoryNameDto;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductCategoryNameCommand  extends AbstractProductCommand {
private ProductCategoryNameDto  ProductCategoryNameDto;
}
