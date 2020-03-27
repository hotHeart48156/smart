package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.OrderReceiverAddressDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderReceiverAddressCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderReceiverAddressService{
@Autowired
private CommandGateway commandGateway;
public void OrderReceiverAddress(OrderReceiverAddressDto dto){
AbstractCommand command=new OrderReceiverAddressCommand(dto);
commandGateway.sendAndWait(command);
}
}