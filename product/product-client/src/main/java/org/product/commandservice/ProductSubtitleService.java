package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductSubtitleService{
@Autowired
private CommandGateway commandGateway;
public void ProductSubtitle(ProductSubtitleDto dto){
AbstractCommand command=new ProductSubtitleCommand(dto);
commandGateway.sendAndWait(command);
}
}