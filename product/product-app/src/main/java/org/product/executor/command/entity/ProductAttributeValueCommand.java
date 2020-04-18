package  org.product.executor.command.entity;

import lombok.Value;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductAttributeValueCommand  extends AbstractProductCommand {
private org.product.dto.entity.ProductAttributeValueDto ProductAttributeValueDto;
}
