package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.SourceTypeEvent;
import org.users.executor.command.aggre.SourceTypeCommand;

@Value
public class SourceTypeCommandHandle{
@CommandHandler
public void on (SourceTypeCommand Command){
AggregateLifecycle.apply(new SourceTypeEvent(Command.getSourceTypeDto()));
}}
