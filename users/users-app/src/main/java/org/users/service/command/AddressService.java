package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.AddressDto;
import org.users.executor.AbstractQuery;
import org.users.executor.command.entity.AddressCommand;

import org.springframework.stereotype.Service;
@Service
public class AddressService{
@Autowired
private CommandGateway commandGateway;
public void Address(AddressDto dto){
AbstractQuery command=new AddressCommand(dto);
commandGateway.sendAndWait(command);
}
}