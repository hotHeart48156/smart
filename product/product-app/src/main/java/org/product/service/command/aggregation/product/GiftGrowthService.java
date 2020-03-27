package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.GiftGrowthDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.GiftGrowthCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GiftGrowthService{
@Autowired
private CommandGateway commandGateway;
public void GiftGrowth(GiftGrowthDto dto){
AbstractCommand command=new GiftGrowthCommand(dto);
commandGateway.sendAndWait(command);
}
}