package  org.activite.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.AbstractCommand;
import org.springframework.stereotype.Component;
@Component
public class DiscountTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void DiscountType(DiscountTypeDto dto){
AbstractCommand command=new DiscountTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}