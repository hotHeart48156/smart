package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductFullReductionService{
@Autowired
private CommandGateway commandGateway;
public void ProductFullReduction(ProductFullReductionDto dto){
AbstractCommand command=new ProductFullReductionCommand(dto);
commandGateway.sendAndWait(command);
}
}