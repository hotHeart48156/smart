package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class SubjectAndProductRelationService{
@Autowired
private CommandGateway commandGateway;
public void SubjectAndProductRelation(SubjectAndProductRelationDto dto){
AbstractCommand command=new SubjectAndProductRelationCommand(dto);
commandGateway.sendAndWait(command);
}
}