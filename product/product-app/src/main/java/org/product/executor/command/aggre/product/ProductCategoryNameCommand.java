package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.dto.aggre.product.ProductCategoryNameDto;
import org.product.executor.AbstractCommand;
@Value
public class ProductCategoryNameCommand  extends AbstractCommand {
private ProductCategoryNameDto  ProductCategoryNameDto;
}
