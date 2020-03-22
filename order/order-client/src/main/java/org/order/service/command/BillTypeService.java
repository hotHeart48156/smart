package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class BillTypeService{
@Autowired
private CommandGateway commandGateway;
public void BillType(BillTypeDto dto){
AbstractCommand command=new BillTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}