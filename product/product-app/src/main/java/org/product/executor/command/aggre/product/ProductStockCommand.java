package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.dto.aggre.product.ProductStockDto;
import org.product.executor.AbstractCommand;
@Value
public class ProductStockCommand  extends AbstractCommand {
private ProductStockDto  ProductStockDto;
}
