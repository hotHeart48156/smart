package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponMinPointService{
@Autowired
private CommandGateway commandGateway;
public void CouponMinPoint(CouponMinPointDto dto){
AbstractCommand command=new CouponMinPointCommand(dto);
commandGateway.sendAndWait(command);
}
}