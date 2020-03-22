package org.order.executor.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class BillContentService{
@Autowired
private CommandGateway commandGateway;
public void BillContent(BillContentDto dto){
AbstractCommand command=new BillContentCommand(dto);
commandGateway.sendAndWait(command);
}
}