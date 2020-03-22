package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPromotionStartTimeService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionStartTime(ProductPromotionStartTimeDto dto){
AbstractCommand command=new ProductPromotionStartTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}