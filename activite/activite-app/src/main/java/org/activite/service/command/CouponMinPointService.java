package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponMinPointDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponMinPointCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponMinPointService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponMinPoint(CouponMinPointDto dto){
AbstractCommand command=new CouponMinPointCommand(dto);
commandGateway.sendAndWait(command);
}
}