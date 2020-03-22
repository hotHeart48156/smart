package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class UsePointLimitService{
@Autowired
private CommandGateway commandGateway;
public void UsePointLimit(UsePointLimitDto dto){
AbstractCommand command=new UsePointLimitCommand(dto);
commandGateway.sendAndWait(command);
}
}