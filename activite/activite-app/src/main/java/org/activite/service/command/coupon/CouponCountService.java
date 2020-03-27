package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponCountService{
@Autowired
private CommandGateway commandGateway;
public void CouponCount(CouponCountDto dto){
AbstractCommand command=new CouponCountCommand(dto);
commandGateway.sendAndWait(command);
}
}