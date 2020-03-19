package  org.activite.service.command;

import org.activite.dto.entity.PromotionLogDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.PromotionLogCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PromotionLogService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void PromotionLog(PromotionLogDto dto){
AbstractCommand command=new PromotionLogCommand(dto);
commandGateway.sendAndWait(command);
}
}