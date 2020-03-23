package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponUsedCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponUsedCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponUsedCountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponUsedCount(CouponUsedCountDto dto){
AbstractCommand command=new CouponUsedCountCommand(dto);
commandGateway.sendAndWait(command);
}
}