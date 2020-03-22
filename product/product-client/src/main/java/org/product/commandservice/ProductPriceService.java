package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductPrice(ProductPriceDto dto){
AbstractCommand command=new ProductPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}