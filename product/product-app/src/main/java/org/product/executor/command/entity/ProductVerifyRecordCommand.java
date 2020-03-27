package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductVerifyRecordDto;
import org.product.executor.AbstractCommand;
@Value
public class ProductVerifyRecordCommand  extends AbstractCommand{
private ProductVerifyRecordDto  ProductVerifyRecordDto;
}
