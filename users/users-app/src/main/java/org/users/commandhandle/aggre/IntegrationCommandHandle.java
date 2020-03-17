package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.IntegrationEvent;
import org.users.executor.command.aggre.IntegrationCommand;

@Value
public class IntegrationCommandHandle{
@CommandHandler
public void on (IntegrationCommand Command){
AggregateLifecycle.apply(new IntegrationEvent(Command.getIntegrationDto()));
}}
