package org.product.executor.command.aggre.product;

import lombok.Value;
import org.product.executor.AbstractCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ShowStatusCommand  extends AbstractProductCommand {
private org.product.dto.aggre.product.ShowStatusDto ShowStatusDto;
}
