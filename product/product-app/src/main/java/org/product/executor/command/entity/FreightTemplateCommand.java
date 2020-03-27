package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.FreightTemplateDto;
import org.product.executor.AbstractCommand;
@Value
public class FreightTemplateCommand  extends AbstractCommand{
private FreightTemplateDto  FreightTemplateDto;
}
