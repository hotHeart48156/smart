package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductServiceService{
@Autowired
private CommandGateway commandGateway;
public void ProductService(ProductServiceDto dto){
AbstractCommand command=new ProductServiceCommand(dto);
commandGateway.sendAndWait(command);
}
}