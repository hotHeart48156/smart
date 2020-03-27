package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.OrderReturnReasonDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderReturnReasonCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderReturnReasonService{
@Autowired
private CommandGateway commandGateway;
public void OrderReturnReason(OrderReturnReasonDto dto){
AbstractCommand command=new OrderReturnReasonCommand(dto);
commandGateway.sendAndWait(command);
}
}