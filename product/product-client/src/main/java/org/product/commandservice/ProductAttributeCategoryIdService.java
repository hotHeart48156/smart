package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductAttributeCategoryIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeCategoryId(ProductAttributeCategoryIdDto dto){
AbstractCommand command=new ProductAttributeCategoryIdCommand(dto);
commandGateway.sendAndWait(command);
}
}