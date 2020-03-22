package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class BrandIdService{
@Autowired
private CommandGateway commandGateway;
public void BrandId(BrandIdDto dto){
AbstractCommand command=new BrandIdCommand(dto);
commandGateway.sendAndWait(command);
}
}