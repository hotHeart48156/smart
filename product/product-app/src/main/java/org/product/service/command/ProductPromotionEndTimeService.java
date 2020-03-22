package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPromotionEndTimeService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionEndTime(ProductPromotionEndTimeDto dto){
AbstractCommand command=new ProductPromotionEndTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}