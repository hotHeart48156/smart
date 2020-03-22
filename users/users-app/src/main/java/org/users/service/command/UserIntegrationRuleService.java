package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.UserIntegrationRuleDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.UserIntegrationRuleCommand;

import org.springframework.stereotype.Service;
@Service
public class UserIntegrationRuleService{
@Autowired
private CommandGateway commandGateway;
public void UserIntegrationRule(UserIntegrationRuleDto dto){
AbstractCommand command=new UserIntegrationRuleCommand(dto);
commandGateway.sendAndWait(command);
}
}