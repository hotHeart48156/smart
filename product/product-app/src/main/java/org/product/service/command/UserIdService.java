package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class UserIdService{
@Autowired
private CommandGateway commandGateway;
public void UserId(UserIdDto dto){
AbstractCommand command=new UserIdCommand(dto);
commandGateway.sendAndWait(command);
}
}