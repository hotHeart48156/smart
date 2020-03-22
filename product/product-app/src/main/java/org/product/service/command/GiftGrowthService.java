package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GiftGrowthService{
@Autowired
private CommandGateway commandGateway;
public void GiftGrowth(GiftGrowthDto dto){
AbstractCommand command=new GiftGrowthCommand(dto);
commandGateway.sendAndWait(command);
}
}