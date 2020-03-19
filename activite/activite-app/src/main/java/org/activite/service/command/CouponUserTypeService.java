package  org.activite.service.command;

import org.activite.dto.agg.CouponUserTypeDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponUserTypeCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponUserTypeService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponUserType(CouponUserTypeDto dto){
AbstractCommand command=new CouponUserTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}