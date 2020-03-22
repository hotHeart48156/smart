package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class PublishStatusService{
@Autowired
private CommandGateway commandGateway;
public void PublishStatus(PublishStatusDto dto){
AbstractCommand command=new PublishStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}