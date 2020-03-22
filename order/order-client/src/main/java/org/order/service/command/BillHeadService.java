package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class BillHeadService{
@Autowired
private CommandGateway commandGateway;
public void BillHead(BillHeadDto dto){
AbstractCommand command=new BillHeadCommand(dto);
commandGateway.sendAndWait(command);
}
}