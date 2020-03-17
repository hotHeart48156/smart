package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.MemberLevelIdEvent;
import org.users.executor.command.aggre.MemberLevelIdCommand;

@Value
public class MemberLevelIdCommandHandle{
@CommandHandler
public void on (MemberLevelIdCommand Command){
AggregateLifecycle.apply(new MemberLevelIdEvent(Command.getMemberLevelIdDto()));
}}
