package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.GiftsDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class GiftsCommand  extends AbstractProductCommand {
private GiftsDto  GiftsDto;
}
