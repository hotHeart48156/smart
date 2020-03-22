package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ReceiverNameService{
@Autowired
private CommandGateway commandGateway;
public void ReceiverName(ReceiverNameDto dto){
AbstractCommand command=new ReceiverNameCommand(dto);
commandGateway.sendAndWait(command);
}
}