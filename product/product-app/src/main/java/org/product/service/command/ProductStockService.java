package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductStockService{
@Autowired
private CommandGateway commandGateway;
public void ProductStock(ProductStockDto dto){
AbstractCommand command=new ProductStockCommand(dto);
commandGateway.sendAndWait(command);
}
}