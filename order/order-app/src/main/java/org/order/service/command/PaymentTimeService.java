package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.aggredto.PaymentTimeDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.PaymentTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentTimeService{
@Autowired
private CommandGateway commandGateway;
public void PaymentTime(PaymentTimeDto dto){
AbstractCommand command=new PaymentTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}