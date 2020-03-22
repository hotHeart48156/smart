package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductNoteService{
@Autowired
private CommandGateway commandGateway;
public void ProductNote(ProductNoteDto dto){
AbstractCommand command=new ProductNoteCommand(dto);
commandGateway.sendAndWait(command);
}
}