package  org.product.executor.command.entity;
import lombok.Value;
import org.product.dto.*;
import org.product.executor.AbstractCommand;
@Value
public class SubjectAndProductRelationCommand  extends AbstractCommand{
private SubjectAndProductRelationDto  SubjectAndProductRelationDto;
}
