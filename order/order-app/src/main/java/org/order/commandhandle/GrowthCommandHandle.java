package  org.order.commandhandle;
import lombok.Value;
@Value
public class GrowthCommandHandle{
@CommandHandler
public void on (GrowthCommand Command){
AggregateLifecycle.apply(new GrowthEvent(Command.getGrowthDto()));
}}
