package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.CouponPublishCountDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.CouponPublishCountCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponPublishCountService{
@Autowired
private CommandGateway commandGateway;
public void CouponPublishCount(CouponPublishCountDto dto){
AbstractCommand command=new CouponPublishCountCommand(dto);
commandGateway.sendAndWait(command);
}
}