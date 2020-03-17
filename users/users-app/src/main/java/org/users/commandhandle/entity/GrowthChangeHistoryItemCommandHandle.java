package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class GrowthChangeHistoryItemCommandHandle{
@CommandHandler
public void on (GrowthChangeHistoryItemCommand Command){
AggregateLifecycle.apply(new GrowthChangeHistoryItemEvent(Command.getGrowthChangeHistoryItemDto()));
}}
