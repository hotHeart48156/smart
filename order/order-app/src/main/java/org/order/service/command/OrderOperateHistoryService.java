package  org.order.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.OrderOperateHistoryDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.OrderOperateHistoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderOperateHistoryService{
@Autowired
private CommandGateway commandGateway;
public void OrderOperateHistory(OrderOperateHistoryDto dto){
AbstractCommand command=new OrderOperateHistoryCommand(dto);
commandGateway.sendAndWait(command);
}
}