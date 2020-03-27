package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductCategoryDto;
import org.product.executor.AbstractCommand;
@Value
public class ProductCategoryCommand  extends AbstractCommand{
private ProductCategoryDto  ProductCategoryDto;
}
