package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.CommentAndProductRelationshipDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.CommentAndProductRelationshipCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class CommentAndProductRelationshipService{
@Autowired
private CommandGateway commandGateway;
public void CommentAndProductRelationship(CommentAndProductRelationshipDto dto){
AbstractCommand command=new CommentAndProductRelationshipCommand(dto);
commandGateway.sendAndWait(command);
}
}