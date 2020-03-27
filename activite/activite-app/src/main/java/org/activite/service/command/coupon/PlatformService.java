package  org.activite.service.command.coupon;
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