package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.OrderSettingDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderSettingCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderSettingService{
@Autowired
private CommandGateway commandGateway;
public void OrderSetting(OrderSettingDto dto){
AbstractCommand command=new OrderSettingCommand(dto);
commandGateway.sendAndWait(command);
}
}