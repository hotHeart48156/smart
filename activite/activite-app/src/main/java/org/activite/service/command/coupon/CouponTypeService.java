package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponTypeService{
@Autowired
private CommandGateway commandGateway;
public void CouponType(CouponTypeDto dto){
AbstractCommand command=new CouponTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}