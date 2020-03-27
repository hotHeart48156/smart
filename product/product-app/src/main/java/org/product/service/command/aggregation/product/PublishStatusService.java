package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.PublishStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.PublishStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PublishStatusService{
@Autowired
private CommandGateway commandGateway;
public void PublishStatus(PublishStatusDto dto){
AbstractCommand command=new PublishStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}