package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.RecommandStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.RecommandStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecommandStatusService{
@Autowired
private CommandGateway commandGateway;
public void RecommandStatus(RecommandStatusDto dto){
AbstractCommand command=new RecommandStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}