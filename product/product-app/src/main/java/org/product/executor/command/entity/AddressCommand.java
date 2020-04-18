package  org.product.executor.command.entity;

import lombok.Value;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class AddressCommand  extends AbstractEntityCommand {
private org.product.dto.entity.AddressDto AddressDto;
}
