package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GroupIdService{
@Autowired
private CommandGateway commandGateway;
public void GroupId(GroupIdDto dto){
AbstractCommand command=new GroupIdCommand(dto);
commandGateway.sendAndWait(command);
}
}