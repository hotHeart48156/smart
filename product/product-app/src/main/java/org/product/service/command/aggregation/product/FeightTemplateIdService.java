package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.FeightTemplateIdDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.FeightTemplateIdCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeightTemplateIdService{
@Autowired
private CommandGateway commandGateway;
public void FeightTemplateId(FeightTemplateIdDto dto){
AbstractCommand command=new FeightTemplateIdCommand(dto);
commandGateway.sendAndWait(command);
}
}