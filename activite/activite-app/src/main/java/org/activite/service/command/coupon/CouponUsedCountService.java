package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponUsedCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponUsedCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponUsedCountService{
@Autowired
private CommandGateway commandGateway;
public void CouponUsedCount(CouponUsedCountDto dto){
AbstractCommand command=new CouponUsedCountCommand(dto);
commandGateway.sendAndWait(command);
}
}