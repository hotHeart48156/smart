package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponEnableTimeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponEnableTimeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponEnableTimeService{
@Autowired
private CommandGateway commandGateway;
public void CouponEnableTime(CouponEnableTimeDto dto){
AbstractCommand command=new CouponEnableTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}