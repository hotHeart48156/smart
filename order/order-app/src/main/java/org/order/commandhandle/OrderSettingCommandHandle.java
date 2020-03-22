package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderSettingCommandHandle{
@CommandHandler
public void on (OrderSettingCommand Command){
AggregateLifecycle.apply(new OrderSettingEvent(Command.getOrderSettingDto()));
}}
