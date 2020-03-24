package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.TagEvent;
import org.users.executor.command.entity.TagCommand;

@Value
public class TagCommandHandle{
@CommandHandler
public void on (TagCommand Command){
AggregateLifecycle.apply(new TagEvent(Command.getTagDto()));
}}
