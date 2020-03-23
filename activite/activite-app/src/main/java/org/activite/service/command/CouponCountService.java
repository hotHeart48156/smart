package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponCountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponCount(CouponCountDto dto){
AbstractCommand command=new CouponCountCommand(dto);
commandGateway.sendAndWait(command);
}
}