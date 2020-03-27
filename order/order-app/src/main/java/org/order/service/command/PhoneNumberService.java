package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.PhoneNumberDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.PhoneNumberCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService{
@Autowired
private CommandGateway commandGateway;
public void PhoneNumber(PhoneNumberDto dto){
AbstractCommand command=new PhoneNumberCommand(dto);
commandGateway.sendAndWait(command);
}
}