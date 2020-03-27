package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponReceiverCountService{
@Autowired
private CommandGateway commandGateway;
public void CouponReceiverCount(CouponReceiverCountDto dto){
AbstractCommand command=new CouponReceiverCountCommand(dto);
commandGateway.sendAndWait(command);
}
}