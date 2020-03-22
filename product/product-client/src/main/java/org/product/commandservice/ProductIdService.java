package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductId(ProductIdDto dto){
AbstractCommand command=new ProductIdCommand(dto);
commandGateway.sendAndWait(command);
}
}