package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class IdService{
@Autowired
private CommandGateway commandGateway;
public void Id(IdDto dto){
AbstractCommand command=new IdCommand(dto);
commandGateway.sendAndWait(command);
}
}