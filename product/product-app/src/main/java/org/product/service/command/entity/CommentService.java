package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.CommentDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.CommentCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class CommentService{
@Autowired
private CommandGateway commandGateway;
public void Comment(CommentDto dto){
AbstractCommand command=new CommentCommand(dto);
commandGateway.sendAndWait(command);
}
}