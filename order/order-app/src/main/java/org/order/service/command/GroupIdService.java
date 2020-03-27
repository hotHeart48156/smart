package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.GroupIdDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.GroupIdCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupIdService{
@Autowired
private CommandGateway commandGateway;
public void GroupId(GroupIdDto dto){
AbstractCommand command=new GroupIdCommand(dto);
commandGateway.sendAndWait(command);
}
}