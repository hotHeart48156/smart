package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponEnableTimeService{
@Autowired
private CommandGateway commandGateway;
public void CouponEnableTime(CouponEnableTimeDto dto){
AbstractCommand command=new CouponEnableTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}