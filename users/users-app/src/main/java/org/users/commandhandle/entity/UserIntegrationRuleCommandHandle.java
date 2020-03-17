package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class UserIntegrationRuleCommandHandle{
@CommandHandler
public void on (UserIntegrationRuleCommand Command){
AggregateLifecycle.apply(new UserIntegrationRuleEvent(Command.getUserIntegrationRuleDto()));
}}
