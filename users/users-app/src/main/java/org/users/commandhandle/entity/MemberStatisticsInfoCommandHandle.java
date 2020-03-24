package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.MemberStatisticsInfoEvent;
import org.users.executor.command.entity.MemberStatisticsInfoCommand;

@Value
public class MemberStatisticsInfoCommandHandle{
@CommandHandler
public void on (MemberStatisticsInfoCommand Command){
AggregateLifecycle.apply(new MemberStatisticsInfoEvent(Command.getMemberStatisticsInfoDto()));
}}
