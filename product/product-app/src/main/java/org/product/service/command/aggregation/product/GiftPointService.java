package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.GiftPointDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.GiftPointCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GiftPointService{
@Autowired
private CommandGateway commandGateway;
public void GiftPoint(GiftPointDto dto){
AbstractCommand command=new GiftPointCommand(dto);
commandGateway.sendAndWait(command);
}
}