package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.agg.PhoneNumberDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.PhoneNumberCommand;

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