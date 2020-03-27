package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponUserTypeService{
@Autowired
private CommandGateway commandGateway;
public void CouponUserType(CouponUserTypeDto dto){
AbstractCommand command=new CouponUserTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}