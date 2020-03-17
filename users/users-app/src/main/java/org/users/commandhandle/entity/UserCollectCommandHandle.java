package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class UserCollectCommandHandle{
@CommandHandler
public void on (UserCollectCommand Command){
AggregateLifecycle.apply(new UserCollectEvent(Command.getUserCollectDto()));
}}
