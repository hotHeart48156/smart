package  org.activite.service.command.entity;

import org.activite.dto.entity.PromotionTypeDto;
import org.activite.executor.command.entity.PromotionTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class PromotionTypeService{
@Autowired
private CommandGateway commandGateway;
public void PromotionType(PromotionTypeDto dto){
AbstractCommand command=new PromotionTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}