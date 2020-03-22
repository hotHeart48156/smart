package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class EntityService{
@Autowired
private CommandGateway commandGateway;
public void Entity(EntityDto dto){
AbstractCommand command=new EntityCommand(dto);
commandGateway.sendAndWait(command);
}
}