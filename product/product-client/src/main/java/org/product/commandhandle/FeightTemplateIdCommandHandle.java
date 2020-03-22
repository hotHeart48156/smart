package  org.product.commandhandle;
import lombok.Value;
@Value
public class FeightTemplateIdCommandHandle{
@CommandHandler
public void on (FeightTemplateIdCommand Command){
AggregateLifecycle.apply(new FeightTemplateIdEvent(Command.getFeightTemplateIdDto()));
}}
