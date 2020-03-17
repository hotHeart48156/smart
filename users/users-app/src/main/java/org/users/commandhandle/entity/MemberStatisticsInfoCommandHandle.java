package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class MemberStatisticsInfoCommandHandle{
@CommandHandler
public void on (MemberStatisticsInfoCommand Command){
AggregateLifecycle.apply(new MemberStatisticsInfoEvent(Command.getMemberStatisticsInfoDto()));
}}
