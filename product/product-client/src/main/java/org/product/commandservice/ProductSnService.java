package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductSnService{
@Autowired
private CommandGateway commandGateway;
public void ProductSn(ProductSnDto dto){
AbstractCommand command=new ProductSnCommand(dto);
commandGateway.sendAndWait(command);
}
}