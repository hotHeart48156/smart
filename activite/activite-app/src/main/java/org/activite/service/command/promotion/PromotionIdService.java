package  org.activite.service.command.promotion;

import org.activite.dto.agg.promotion.PromotionIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.promotion.PromotionIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class PromotionIdService{
@Autowired
private CommandGateway commandGateway;
public void PromotionId(PromotionIdDto dto){
AbstractCommand command=new PromotionIdCommand(dto);
commandGateway.sendAndWait(command);
}
}