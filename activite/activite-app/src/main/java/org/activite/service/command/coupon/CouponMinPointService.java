package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponMinPointDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponMinPointCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponMinPointService{
@Autowired
private CommandGateway commandGateway;
public void CouponMinPoint(CouponMinPointDto dto){
AbstractCommand command=new CouponMinPointCommand(dto);
commandGateway.sendAndWait(command);
}
}