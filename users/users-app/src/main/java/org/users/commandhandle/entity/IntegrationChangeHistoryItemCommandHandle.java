package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.IntegrationChangeHistoryItemEvent;
import org.users.executor.command.entity.IntegrationChangeHistoryItemCommand;

@Value
public class IntegrationChangeHistoryItemCommandHandle{
@CommandHandler
public void on (IntegrationChangeHistoryItemCommand Command){
AggregateLifecycle.apply(new IntegrationChangeHistoryItemEvent(Command.getIntegrationChangeHistoryItemDto()));
}}
