package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.AddressDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.AddressCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddressService{
@Autowired
private CommandGateway commandGateway;
public void Address(AddressDto dto){
AbstractCommand command=new AddressCommand(dto);
commandGateway.sendAndWait(command);
}
}