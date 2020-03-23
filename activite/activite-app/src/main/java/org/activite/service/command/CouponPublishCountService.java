package  org.activite.service.command;

import org.activite.dto.agg.coupon.CouponPublishCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponPublishCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponPublishCountService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponPublishCount(CouponPublishCountDto dto){
AbstractCommand command=new CouponPublishCountCommand(dto);
commandGateway.sendAndWait(command);
}
}