package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class TagCommandHandle{
@CommandHandler
public void on (TagCommand Command){
AggregateLifecycle.apply(new TagEvent(Command.getTagDto()));
}}
