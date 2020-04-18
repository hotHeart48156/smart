package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.dto.aggre.product.ProductStockDto;
import org.product.executor.AbstractCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductStockCommand  extends AbstractProductCommand {
private ProductStockDto  ProductStockDto;
}
