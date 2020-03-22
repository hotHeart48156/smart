package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ShowStatusService{
@Autowired
private CommandGateway commandGateway;
public void ShowStatus(ShowStatusDto dto){
AbstractCommand command=new ShowStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}