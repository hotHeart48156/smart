package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPromotionPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionPrice(ProductPromotionPriceDto dto){
AbstractCommand command=new ProductPromotionPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}