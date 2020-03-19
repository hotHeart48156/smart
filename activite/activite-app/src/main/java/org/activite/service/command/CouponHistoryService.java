package  org.activite.service.command;

import org.activite.dto.entity.CouponHistoryDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.CouponHistoryCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CouponHistoryService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void CouponHistory(CouponHistoryDto dto){
AbstractCommand command=new CouponHistoryCommand(dto);
commandGateway.sendAndWait(command);
}
}