package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductSalesQualitityService{
@Autowired
private CommandGateway commandGateway;
public void ProductSalesQualitity(ProductSalesQualitityDto dto){
AbstractCommand command=new ProductSalesQualitityCommand(dto);
commandGateway.sendAndWait(command);
}
}