package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.MemberLevelEvent;
import org.users.executor.command.entity.MemberLevelCommand;

@Value
public class MemberLevelCommandHandle{
@CommandHandler
public void on (MemberLevelCommand Command){
AggregateLifecycle.apply(new MemberLevelEvent(Command.getMemberLevelDto()));
}}
