package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GiftAndProductRelationshipService{
@Autowired
private CommandGateway commandGateway;
public void GiftAndProductRelationship(GiftAndProductRelationshipDto dto){
AbstractCommand command=new GiftAndProductRelationshipCommand(dto);
commandGateway.sendAndWait(command);
}
}