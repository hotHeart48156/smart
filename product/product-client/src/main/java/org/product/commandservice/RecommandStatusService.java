package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class RecommandStatusService{
@Autowired
private CommandGateway commandGateway;
public void RecommandStatus(RecommandStatusDto dto){
AbstractCommand command=new RecommandStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}