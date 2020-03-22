package  org.product.commandhandle;
import lombok.Value;
@Value
public class UserIdCommandHandle{
@CommandHandler
public void on (UserIdCommand Command){
AggregateLifecycle.apply(new UserIdEvent(Command.getUserIdDto()));
}}
