package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.DiscountTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.DiscountTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class DiscountTypeService{
@Autowired
private CommandGateway commandGateway;
public void DiscountType(DiscountTypeDto dto){
AbstractCommand command=new DiscountTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}