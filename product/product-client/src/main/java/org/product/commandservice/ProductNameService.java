package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductNameService{
@Autowired
private CommandGateway commandGateway;
public void ProductName(ProductNameDto dto){
AbstractCommand command=new ProductNameCommand(dto);
commandGateway.sendAndWait(command);
}
}