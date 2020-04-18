package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.GiftsCategoryDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

@Value
@Component
public class GiftsCategoryCommand  extends AbstractProductCommand {
private GiftsCategoryDto  GiftsCategoryDto;
}
