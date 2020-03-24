package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.IntegrationConsumeSettingDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.IntegrationConsumeSettingCommand;

import org.springframework.stereotype.Service;
@Service
public class IntegrationConsumeSettingService{
@Autowired
private CommandGateway commandGateway;
public void IntegrationConsumeSetting(IntegrationConsumeSettingDto dto){
AbstractCommand command=new IntegrationConsumeSettingCommand(dto);
commandGateway.sendAndWait(command);
}
}