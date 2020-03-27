package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.VerifyStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.VerifyStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VerifyStatusService{
@Autowired
private CommandGateway commandGateway;
public void VerifyStatus(VerifyStatusDto dto){
AbstractCommand command=new VerifyStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}