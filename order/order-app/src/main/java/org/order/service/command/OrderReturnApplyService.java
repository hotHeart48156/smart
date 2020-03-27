package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.OrderReturnApplyDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderReturnApplyCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderReturnApplyService{
@Autowired
private CommandGateway commandGateway;
public void OrderReturnApply(OrderReturnApplyDto dto){
AbstractCommand command=new OrderReturnApplyCommand(dto);
commandGateway.sendAndWait(command);
}
}