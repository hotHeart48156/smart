package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class CommentService{
@Autowired
private CommandGateway commandGateway;
public void Comment(CommentDto dto){
AbstractCommand command=new CommentCommand(dto);
commandGateway.sendAndWait(command);
}
}