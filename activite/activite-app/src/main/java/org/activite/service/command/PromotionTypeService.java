package  org.activite.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.AbstractCommand;
import org.springframework.stereotype.Component;
@Component
public class PromotionTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void PromotionType(PromotionTypeDto dto){
AbstractCommand command=new PromotionTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}