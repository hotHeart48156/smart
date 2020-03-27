package  org.product.service.command.aggregation.product;


import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.PreviewStatusDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.PreviewStatusCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PreviewStatusService{
@Autowired
private CommandGateway commandGateway;
public void PreviewStatus(PreviewStatusDto dto){
AbstractCommand command=new PreviewStatusCommand(dto);
commandGateway.sendAndWait(command);
}
}