package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponUsedCountService{
@Autowired
private CommandGateway commandGateway;
public void CouponUsedCount(CouponUsedCountDto dto){
AbstractCommand command=new CouponUsedCountCommand(dto);
commandGateway.sendAndWait(command);
}
}