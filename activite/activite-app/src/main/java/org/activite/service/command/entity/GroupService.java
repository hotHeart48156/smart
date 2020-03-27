package  org.activite.service.command.entity;

import org.activite.dto.entity.GroupDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.GroupCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class GroupService{
@Autowired
private CommandGateway commandGateway;
public void Group(GroupDto dto){
AbstractCommand command=new GroupCommand(dto);
commandGateway.sendAndWait(command);
}
}