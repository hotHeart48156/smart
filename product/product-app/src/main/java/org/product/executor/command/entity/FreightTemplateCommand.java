package  org.product.executor.command.entity;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.product.dto.entity.FreightTemplateDto;
import org.product.executor.command.aggre.product.AbstractProductCommand;
import org.springframework.stereotype.Component;

/**
 * @author yangbiao
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Component
public class FreightTemplateCommand  extends AbstractProductCommand {
private FreightTemplateDto  freightTemplateDto;
}
