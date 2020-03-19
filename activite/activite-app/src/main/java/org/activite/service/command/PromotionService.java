package  org.activite.service.command;

import org.activite.executor.AbstractCommand;
import org.activite.executor.command.PromotionCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PromotionService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void Promotion(PromotionDto dto){
AbstractCommand command=new PromotionCommand(dto);
commandGateway.sendAndWait(command);
}
}