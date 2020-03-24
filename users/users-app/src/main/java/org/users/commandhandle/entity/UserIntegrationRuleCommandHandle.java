package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.UserIntegrationRuleEvent;
import org.users.executor.command.entity.UserIntegrationRuleCommand;

@Value
public class UserIntegrationRuleCommandHandle{
@CommandHandler
public void on (UserIntegrationRuleCommand Command){
AggregateLifecycle.apply(new UserIntegrationRuleEvent(Command.getUserIntegrationRuleDto()));
}}
