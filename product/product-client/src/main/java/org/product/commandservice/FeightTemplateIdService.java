package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class FeightTemplateIdService{
@Autowired
private CommandGateway commandGateway;
public void FeightTemplateId(FeightTemplateIdDto dto){
AbstractCommand command=new FeightTemplateIdCommand(dto);
commandGateway.sendAndWait(command);
}
}