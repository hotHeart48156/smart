package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.AppletSetDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.AppletSetCommand;

import org.springframework.stereotype.Service;
@Service
public class AppletSetService{
@Autowired
private CommandGateway commandGateway;
public void AppletSet(AppletSetDto dto){
AbstractCommand command=new AppletSetCommand(dto);
commandGateway.sendAndWait(command);
}
}