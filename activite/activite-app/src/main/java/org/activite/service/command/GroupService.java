package  org.activite.service.command;

import org.activite.dto.entity.GroupDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.GroupCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GroupService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Group(GroupDto dto){
AbstractCommand command=new GroupCommand(dto);
commandGateway.sendAndWait(command);
}
}