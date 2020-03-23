package  org.product.executor.command.entity;
import lombok.Value;
import org.product.dto.*;
import org.product.executor.AbstractCommand;
@Value
public class ProductSkuStockCommand  extends AbstractCommand{
private ProductSkuStockDto  ProductSkuStockDto;
}
