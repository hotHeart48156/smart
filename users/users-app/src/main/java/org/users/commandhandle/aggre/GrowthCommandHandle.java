package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.GrowthEvent;
import org.users.executor.command.aggre.GrowthCommand;

@Value
public class GrowthCommandHandle{
@CommandHandler
public void on (GrowthCommand Command){
AggregateLifecycle.apply(new GrowthEvent(Command.getGrowthDto()));
}}
