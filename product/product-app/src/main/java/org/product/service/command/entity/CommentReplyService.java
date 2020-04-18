package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.CommentReplyDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.CommentReplyCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class CommentReplyService{
@Autowired
private CommandGateway commandGateway;
public void commentReply(CommentReplyDto dto){
AbstractCommand command=new CommentReplyCommand(dto);
commandGateway.sendAndWait(command);
}
}