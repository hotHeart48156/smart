package  org.product.executor.command.entity;
import lombok.Value;
import org.product.dto.*;
import org.product.executor.AbstractCommand;
@Value
public class ProductConsultCommand  extends AbstractCommand{
private ProductConsultDto  ProductConsultDto;
}
