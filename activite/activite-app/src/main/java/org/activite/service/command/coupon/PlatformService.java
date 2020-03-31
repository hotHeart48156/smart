package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.PlatformDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.PlatformCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class PlatformService{
@Autowired
private CommandGateway commandGateway;
public void Platform(PlatformDto dto){
AbstractCommand command=new PlatformCommand(dto);
commandGateway.sendAndWait(command);
}
}