package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductCommentService{
@Autowired
private CommandGateway commandGateway;
public void ProductComment(ProductCommentDto dto){
AbstractCommand command=new ProductCommentCommand(dto);
commandGateway.sendAndWait(command);
}
}