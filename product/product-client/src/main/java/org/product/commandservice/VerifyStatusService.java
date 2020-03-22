package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class VerifyStatusService{
@Autowired
private CommandGateway commandGateway;
public void VerifyStatus(VerifyStatusDto dto){
AbstractCommand command=new VerifyStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}