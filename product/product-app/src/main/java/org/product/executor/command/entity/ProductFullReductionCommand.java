package  org.product.executor.command.entity;
import lombok.Value;
import org.product.dto.*;
import org.product.executor.AbstractCommand;
@Value
public class ProductFullReductionCommand  extends AbstractCommand{
private ProductFullReductionDto  ProductFullReductionDto;
}
