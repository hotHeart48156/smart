package  org.order.commandhandle;
import lombok.Value;
@Value
public class AutoConfirmTimeCommandHandle{
@CommandHandler
public void on (AutoConfirmTimeCommand Command){
AggregateLifecycle.apply(new AutoConfirmTimeEvent(Command.getAutoConfirmTimeDto()));
}}
