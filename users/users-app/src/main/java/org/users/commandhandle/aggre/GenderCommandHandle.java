package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.GenderEvent;
import org.users.executor.command.aggre.GenderCommand;

@Value
public class GenderCommandHandle{
@CommandHandler
public void on (GenderCommand Command){
AggregateLifecycle.apply(new GenderEvent(Command.getGenderDto()));
}}
