package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.PromotionTypeDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.PromotionTypeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PromotionTypeService{
@Autowired
private CommandGateway commandGateway;
public void PromotionType(PromotionTypeDto dto){
AbstractCommand command=new PromotionTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}