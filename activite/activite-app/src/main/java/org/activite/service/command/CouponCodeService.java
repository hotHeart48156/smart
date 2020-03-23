package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponCodeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponCodeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Component
public class CouponCodeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponCode(CouponCodeDto dto){
AbstractCommand command=new CouponCodeCommand(dto);
commandGateway.sendAndWait(command);
}
}