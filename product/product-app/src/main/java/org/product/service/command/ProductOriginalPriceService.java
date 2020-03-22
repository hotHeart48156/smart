package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductOriginalPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductOriginalPrice(ProductOriginalPriceDto dto){
AbstractCommand command=new ProductOriginalPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}