package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class PhoneNumberService{
@Autowired
private CommandGateway commandGateway;
public void PhoneNumber(PhoneNumberDto dto){
AbstractCommand command=new PhoneNumberCommand(dto);
commandGateway.sendAndWait(command);
}
}