package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.entity.GrowthChangeHistoryItemEvent;
import org.users.executor.command.entity.GrowthChangeHistoryItemCommand;

@Value
public class GrowthChangeHistoryItemCommandHandle{
@CommandHandler
public void on (GrowthChangeHistoryItemCommand Command){
AggregateLifecycle.apply(new GrowthChangeHistoryItemEvent(Command.getGrowthChangeHistoryItemDto()));
}}
