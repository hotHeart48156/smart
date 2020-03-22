package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductLogoService{
@Autowired
private CommandGateway commandGateway;
public void ProductLogo(ProductLogoDto dto){
AbstractCommand command=new ProductLogoCommand(dto);
commandGateway.sendAndWait(command);
}
}