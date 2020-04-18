package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductLadderDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductLadderCommand  extends AbstractProductCommand {
private ProductLadderDto productLadderDto;
}
