package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.BillHeadDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.BillHeadCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillHeadService{
@Autowired
private CommandGateway commandGateway;
public void BillHead(BillHeadDto dto){
AbstractCommand command=new BillHeadCommand(dto);
commandGateway.sendAndWait(command);
}
}