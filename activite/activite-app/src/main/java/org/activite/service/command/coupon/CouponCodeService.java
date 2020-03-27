package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponCodeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponCodeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;

public class CouponCodeService{
@Autowired
private CommandGateway commandGateway;
public void CouponCode(CouponCodeDto dto){
AbstractCommand command=new CouponCodeCommand(dto);
commandGateway.sendAndWait(command);
}
}