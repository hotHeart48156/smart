package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.DeleteStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.DeleteStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeleteStatusService{
@Autowired
private CommandGateway commandGateway;
public void DeleteStatus(DeleteStatusDto dto){
AbstractCommand command=new DeleteStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}