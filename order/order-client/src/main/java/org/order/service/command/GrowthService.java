package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GrowthService{
@Autowired
private CommandGateway commandGateway;
public void Growth(GrowthDto dto){
AbstractCommand command=new GrowthCommand(dto);
commandGateway.sendAndWait(command);
}
}