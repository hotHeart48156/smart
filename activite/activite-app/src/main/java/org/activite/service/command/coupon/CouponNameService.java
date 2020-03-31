package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponNameDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponNameCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponNameService{
@Autowired
private CommandGateway commandGateway;
public void CouponName(CouponNameDto dto){
AbstractCommand command=new CouponNameCommand(dto);
commandGateway.sendAndWait(command);
}
}