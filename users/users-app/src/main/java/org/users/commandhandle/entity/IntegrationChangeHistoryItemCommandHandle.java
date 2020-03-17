package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class IntegrationChangeHistoryItemCommandHandle{
@CommandHandler
public void on (IntegrationChangeHistoryItemCommand Command){
AggregateLifecycle.apply(new IntegrationChangeHistoryItemEvent(Command.getIntegrationChangeHistoryItemDto()));
}}
