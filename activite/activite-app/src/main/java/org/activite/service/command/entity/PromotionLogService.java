package  org.activite.service.command.entity;

import org.activite.dto.entity.PromotionLogDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.PromotionLogCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class PromotionLogService{
@Autowired
private CommandGateway commandGateway;
public void PromotionLog(PromotionLogDto dto){
AbstractCommand command=new PromotionLogCommand(dto);
commandGateway.sendAndWait(command);
}
}