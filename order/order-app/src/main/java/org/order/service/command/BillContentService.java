package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.BillContentDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.BillContentCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillContentService{
@Autowired
private CommandGateway commandGateway;
public void BillContent(BillContentDto dto){
AbstractCommand command=new BillContentCommand(dto);
commandGateway.sendAndWait(command);
}
}