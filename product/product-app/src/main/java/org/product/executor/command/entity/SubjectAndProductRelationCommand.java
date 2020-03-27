package  org.product.executor.command.entity;

import lombok.Value;
import org.product.dto.entity.SubjectAndProductRelationDto;
import org.product.executor.AbstractCommand;
@Value
public class SubjectAndProductRelationCommand  extends AbstractCommand{
private SubjectAndProductRelationDto  SubjectAndProductRelationDto;
}
