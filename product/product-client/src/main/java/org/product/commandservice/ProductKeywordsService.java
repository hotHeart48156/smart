package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductKeywordsService{
@Autowired
private CommandGateway commandGateway;
public void ProductKeywords(ProductKeywordsDto dto){
AbstractCommand command=new ProductKeywordsCommand(dto);
commandGateway.sendAndWait(command);
}
}