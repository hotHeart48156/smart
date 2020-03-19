package  org.activite.service.command;

import org.activite.dto.agg.CouponReceiverCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponReceiverCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponReceiverCountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponReceiverCount(CouponReceiverCountDto dto){
AbstractCommand command=new CouponReceiverCountCommand(dto);
commandGateway.sendAndWait(command);
}
}