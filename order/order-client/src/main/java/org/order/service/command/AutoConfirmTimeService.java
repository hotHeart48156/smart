package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class AutoConfirmTimeService{
@Autowired
private CommandGateway commandGateway;
public void AutoConfirmTime(AutoConfirmTimeDto dto){
AbstractCommand command=new AutoConfirmTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}