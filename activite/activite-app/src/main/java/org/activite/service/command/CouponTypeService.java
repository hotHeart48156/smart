package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponType(CouponTypeDto dto){
AbstractCommand command=new CouponTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}