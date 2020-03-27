package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductOperateLogDto;
import org.product.executor.AbstractCommand;
@Value
public class ProductOperateLogCommand  extends AbstractCommand{
private ProductOperateLogDto  ProductOperateLogDto;
}
