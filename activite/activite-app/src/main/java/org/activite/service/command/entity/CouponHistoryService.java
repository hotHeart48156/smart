package  org.activite.service.command.entity;

import org.activite.dto.entity.CouponHistoryDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.CouponHistoryCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponHistoryService{
@Autowired
private CommandGateway commandGateway;
public void CouponHistory(CouponHistoryDto dto){
AbstractCommand command=new CouponHistoryCommand(dto);
commandGateway.sendAndWait(command);
}
}