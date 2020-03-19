package  org.activite.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.AbstractCommand;
import org.springframework.stereotype.Component;
@Component
public class HomeAdvertiseService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void HomeAdvertise(HomeAdvertiseDto dto){
AbstractCommand command=new HomeAdvertiseCommand(dto);
commandGateway.sendAndWait(command);
}
}