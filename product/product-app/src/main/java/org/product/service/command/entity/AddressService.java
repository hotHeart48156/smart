package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.AddressDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.AddressCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class AddressService{
@Autowired
private CommandGateway commandGateway;
public void address(AddressDto dto){
AbstractCommand command=new AddressCommand(dto);
commandGateway.sendAndWait(command);
}
}