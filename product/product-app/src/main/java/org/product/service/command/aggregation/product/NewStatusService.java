package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.NewStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.NewStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewStatusService{
@Autowired
private CommandGateway commandGateway;
public void NewStatus(NewStatusDto dto){
AbstractCommand command=new NewStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}