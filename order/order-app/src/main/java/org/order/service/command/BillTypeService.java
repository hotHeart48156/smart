package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.BillTypeDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.BillTypeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillTypeService{
@Autowired
private CommandGateway commandGateway;
public void BillType(BillTypeDto dto){
AbstractCommand command=new BillTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}