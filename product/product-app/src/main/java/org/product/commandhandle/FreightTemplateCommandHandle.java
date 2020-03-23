package  org.product.commandhandle;

import lombok.Value;
import org.product.executor.command.FreightTemplateCommand;
import org.product.event.FreightTemplateEvent;

@Value
public class FreightTemplateCommandHandle{
@CommandHandler
public void on (FreightTemplateCommand Command){
AggregateLifecycle.apply(new FreightTemplateEvent(Command.getFreightTemplateDto()));
}}
