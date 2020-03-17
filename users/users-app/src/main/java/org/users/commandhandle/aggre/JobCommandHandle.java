package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.JobEvent;
import org.users.executor.command.aggre.JobCommand;

@Value
public class JobCommandHandle{
@CommandHandler
public void on (JobCommand Command){
AggregateLifecycle.apply(new JobEvent(Command.getJobDto()));
}}
