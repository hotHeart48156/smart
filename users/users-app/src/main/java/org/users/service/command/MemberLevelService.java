package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.entity.MemberLevelDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.MemberLevelCommand;
@Service
public class MemberLevelService{
@Autowired
private CommandGateway commandGateway;
public void MemberLevel(MemberLevelDto dto){
AbstractCommand command=new MemberLevelCommand(dto);
commandGateway.sendAndWait(command);
}
}