package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class OrderSettingService{
@Autowired
private CommandGateway commandGateway;
public void OrderSetting(OrderSettingDto dto){
AbstractCommand command=new OrderSettingCommand(dto);
commandGateway.sendAndWait(command);
}
}