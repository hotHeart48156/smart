package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.executor.AbstractCommand;
@Value
public class UsePointLimitCommand  extends AbstractCommand {
private org.product.dto.aggre.product.UsePointLimitDto UsePointLimitDto;
}
