package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.ProductVerifyRecordDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class ProductVerifyRecordCommand  extends AbstractProductCommand {
private ProductVerifyRecordDto productVerifyRecordDto;
}
