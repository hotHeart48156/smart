package  org.order.commandhandle;
import lombok.Value;
@Value
public class GroupIdCommandHandle{
@CommandHandler
public void on (GroupIdCommand Command){
AggregateLifecycle.apply(new GroupIdEvent(Command.getGroupIdDto()));
}}
