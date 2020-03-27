package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponTypeService{
@Autowired
private CommandGateway commandGateway;
public void CouponType(CouponTypeDto dto){
AbstractCommand command=new CouponTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}