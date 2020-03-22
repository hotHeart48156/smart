package  org.order.commandhandle;
import lombok.Value;
@Value
public class OrderReturnApplyCommandHandle{
@CommandHandler
public void on (OrderReturnApplyCommand Command){
AggregateLifecycle.apply(new OrderReturnApplyEvent(Command.getOrderReturnApplyDto()));
}}
