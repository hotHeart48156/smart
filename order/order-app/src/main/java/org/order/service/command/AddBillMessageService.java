package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.AddBillMessageCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddBillMessageService{
@Autowired
private CommandGateway commandGateway;
public void AddBillMessage(AddBillMessageDto dto){
AbstractCommand command=new AddBillMessageCommand(dto);
commandGateway.sendAndWait(command);
}
}