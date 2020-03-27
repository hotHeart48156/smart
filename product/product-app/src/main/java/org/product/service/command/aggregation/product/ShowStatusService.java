package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ShowStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ShowStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShowStatusService{
@Autowired
private CommandGateway commandGateway;
public void ShowStatus(ShowStatusDto dto){
AbstractCommand command=new ShowStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}