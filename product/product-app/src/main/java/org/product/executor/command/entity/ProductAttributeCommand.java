package  org.product.executor.command.entity;

import lombok.Value;
import org.product.executor.AbstractCommand;
@Value
public class ProductAttributeCommand  extends AbstractCommand{
private org.product.dto.entity.ProductAttributeDto ProductAttributeDto;
}