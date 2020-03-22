package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderOperateHistoryCommandHandle{
@CommandHandler
public void on (OrderOperateHistoryCommand Command){
AggregateLifecycle.apply(new OrderOperateHistoryEvent(Command.getOrderOperateHistoryDto()));
}}
