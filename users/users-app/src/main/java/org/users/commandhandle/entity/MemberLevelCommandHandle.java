package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class MemberLevelCommandHandle{
@CommandHandler
public void on (MemberLevelCommand Command){
AggregateLifecycle.apply(new MemberLevelEvent(Command.getMemberLevelDto()));
}}
