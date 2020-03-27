package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.UsePointLimitDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.UsePointLimitCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsePointLimitService{
@Autowired
private CommandGateway commandGateway;
public void UsePointLimit(UsePointLimitDto dto){
AbstractCommand command=new UsePointLimitCommand(dto);
commandGateway.sendAndWait(command);
}
}