package  org.activite.service.command;

import org.activite.dto.agg.CouponIdDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponIdCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponIdService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponId(CouponIdDto dto){
AbstractCommand command=new CouponIdCommand(dto);
commandGateway.sendAndWait(command);
}
}