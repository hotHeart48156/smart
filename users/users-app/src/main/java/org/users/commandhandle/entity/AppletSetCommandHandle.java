package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class AppletSetCommandHandle{
@CommandHandler
public void on (AppletSetCommand Command){
AggregateLifecycle.apply(new AppletSetEvent(Command.getAppletSetDto()));
}}
