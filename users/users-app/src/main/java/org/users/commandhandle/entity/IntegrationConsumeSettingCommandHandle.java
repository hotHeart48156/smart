package  org.users.commandhandle.entity;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.IntegrationConsumeSettingEvent;
import org.users.executor.command.entity.IntegrationConsumeSettingCommand;

@Value
public class IntegrationConsumeSettingCommandHandle{
@CommandHandler
public void on (IntegrationConsumeSettingCommand Command){
AggregateLifecycle.apply(new IntegrationConsumeSettingEvent(Command.getIntegrationConsumeSettingDto()));
}}
