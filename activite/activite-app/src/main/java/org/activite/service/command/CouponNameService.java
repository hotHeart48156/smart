package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponNameDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponNameCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponNameService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponName(CouponNameDto dto){
AbstractCommand command=new CouponNameCommand(dto);
commandGateway.sendAndWait(command);
}
}