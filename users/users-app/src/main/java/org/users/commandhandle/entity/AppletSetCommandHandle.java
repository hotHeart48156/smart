package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.AppletSetEvent;
import org.users.executor.command.entity.AppletSetCommand;

@Value
public class AppletSetCommandHandle{
@CommandHandler
public void on (AppletSetCommand Command){
AggregateLifecycle.apply(new AppletSetEvent(Command.getAppletSetDto()));
}}
