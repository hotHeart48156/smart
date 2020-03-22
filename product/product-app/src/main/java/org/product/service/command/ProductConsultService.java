package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductConsultService{
@Autowired
private CommandGateway commandGateway;
public void ProductConsult(ProductConsultDto dto){
AbstractCommand command=new ProductConsultCommand(dto);
commandGateway.sendAndWait(command);
}
}