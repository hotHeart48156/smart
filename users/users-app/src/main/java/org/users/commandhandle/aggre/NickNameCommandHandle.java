package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.NickNameEvent;
import org.users.executor.command.aggre.NickNameCommand;

@Value
public class NickNameCommandHandle{
@CommandHandler
public void on (NickNameCommand Command){
AggregateLifecycle.apply(new NickNameEvent(Command.getNickNameDto()));
}}
