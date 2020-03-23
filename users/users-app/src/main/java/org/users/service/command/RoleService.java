package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.RoleDto;
import org.users.executor.AbstractQuery;
import org.users.executor.command.entity.RoleCommand;

import org.springframework.stereotype.Service;
@Service
public class RoleService{
@Autowired
private CommandGateway commandGateway;
public void Role(RoleDto dto){
AbstractQuery command=new RoleCommand(dto);
commandGateway.sendAndWait(command);
}
}