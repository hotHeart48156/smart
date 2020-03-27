package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.executor.AbstractCommand;
@Value
public class ProductSalesQualitityCommand  extends AbstractCommand {
private org.product.dto.aggre.product.ProductSalesQualitityDto ProductSalesQualitityDto;
}
