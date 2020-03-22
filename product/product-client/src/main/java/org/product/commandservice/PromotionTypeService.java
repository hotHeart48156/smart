package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class PromotionTypeService{
@Autowired
private CommandGateway commandGateway;
public void PromotionType(PromotionTypeDto dto){
AbstractCommand command=new PromotionTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}