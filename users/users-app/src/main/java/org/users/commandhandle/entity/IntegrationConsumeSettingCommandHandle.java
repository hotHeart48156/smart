package  org.users.commandhandle.entity;
import lombok.Value;
@Value
public class IntegrationConsumeSettingCommandHandle{
@CommandHandler
public void on (IntegrationConsumeSettingCommand Command){
AggregateLifecycle.apply(new IntegrationConsumeSettingEvent(Command.getIntegrationConsumeSettingDto()));
}}
