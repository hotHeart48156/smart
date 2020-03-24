package  org.product.commandhandle;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.event.SubjectAndProductRelationEvent;
import org.product.executor.command.entity.SubjectAndProductRelationCommand;

@Value
public class SubjectAndProductRelationCommandHandle{
@CommandHandler
public void on (SubjectAndProductRelationCommand Command){
AggregateLifecycle.apply(new SubjectAndProductRelationEvent(Command.getSubjectAndProductRelationDto()));
}}
