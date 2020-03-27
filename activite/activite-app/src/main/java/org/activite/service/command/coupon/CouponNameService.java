package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponNameService{
@Autowired
private CommandGateway commandGateway;
public void CouponName(CouponNameDto dto){
AbstractCommand command=new CouponNameCommand(dto);
commandGateway.sendAndWait(command);
}
}