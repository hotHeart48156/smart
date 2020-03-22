package  org.order.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class CompanyAddressService{
@Autowired
private CommandGateway commandGateway;
public void CompanyAddress(CompanyAddressDto dto){
AbstractCommand command=new CompanyAddressCommand(dto);
commandGateway.sendAndWait(command);
}
}