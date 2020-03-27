package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.executor.AbstractCommand;
@Value
public class ProductNameCommand  extends AbstractCommand {
private org.product.dto.aggre.product.ProductNameDto ProductNameDto;
}
