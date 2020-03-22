package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class PaymentTimeService{
@Autowired
private CommandGateway commandGateway;
public void PaymentTime(PaymentTimeDto dto){
AbstractCommand command=new PaymentTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}