package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductCategoryIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductCategoryId(ProductCategoryIdDto dto){
AbstractCommand command=new ProductCategoryIdCommand(dto);
commandGateway.sendAndWait(command);
}
}