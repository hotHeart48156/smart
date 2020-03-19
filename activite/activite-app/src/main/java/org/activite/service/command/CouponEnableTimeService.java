package  org.activite.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.AbstractCommand;
import org.springframework.stereotype.Component;
@Component
public class CouponEnableTimeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponEnableTime(CouponEnableTimeDto dto){
AbstractCommand command=new CouponEnableTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}