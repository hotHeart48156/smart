package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponAmountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponAmountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
@Component
public class CouponAmountService   extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponAmount(CouponAmountDto dto){
AbstractCommand command=new CouponAmountCommand(dto);
commandGateway.sendAndWait(command);
}
}