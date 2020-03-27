package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.AutoConfirmTimeDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.AutoConfirmTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoConfirmTimeService{
@Autowired
private CommandGateway commandGateway;
public void AutoConfirmTime(AutoConfirmTimeDto dto){
AbstractCommand command=new AutoConfirmTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}