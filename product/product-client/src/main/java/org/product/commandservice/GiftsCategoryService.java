package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class GiftsCategoryService{
@Autowired
private CommandGateway commandGateway;
public void GiftsCategory(GiftsCategoryDto dto){
AbstractCommand command=new GiftsCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}