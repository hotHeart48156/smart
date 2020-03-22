package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPicService{
@Autowired
private CommandGateway commandGateway;
public void ProductPic(ProductPicDto dto){
AbstractCommand command=new ProductPicCommand(dto);
commandGateway.sendAndWait(command);
}
}