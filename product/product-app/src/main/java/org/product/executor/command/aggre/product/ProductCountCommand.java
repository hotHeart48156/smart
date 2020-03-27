package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.executor.AbstractCommand;
@Value
public class ProductCountCommand  extends AbstractCommand {
private org.product.dto.aggre.product.ProductCountDto ProductCountDto;
}
