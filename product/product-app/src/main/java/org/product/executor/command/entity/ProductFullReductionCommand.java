package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductFullReductionDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductFullReductionCommand  extends AbstractProductCommand {
private ProductFullReductionDto  productFullReductionDto;
}
