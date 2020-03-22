package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class AddBillMessageService{
@Autowired
private CommandGateway commandGateway;
public void AddBillMessage(AddBillMessageDto dto){
AbstractCommand command=new AddBillMessageCommand(dto);
commandGateway.sendAndWait(command);
}
}