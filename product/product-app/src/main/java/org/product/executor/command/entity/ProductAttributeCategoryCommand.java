package  org.product.executor.command.entity;

import lombok.Value;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductAttributeCategoryCommand  extends AbstractEntityCommand {
private org.product.dto.entity.ProductAttributeCategoryDto productAttributeCategoryDto;
}
