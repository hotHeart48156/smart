package  org.activite.service.command.promotion;

import org.activite.dto.agg.promotion.PromotionStatusDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.promotion.PromotionStatusCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class PromotionStatusService{
@Autowired
private CommandGateway commandGateway;
public void PromotionStatus(PromotionStatusDto dto){
AbstractCommand command=new PromotionStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}