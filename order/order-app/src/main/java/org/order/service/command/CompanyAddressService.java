package  org.order.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.order.dto.entitydto.CompanyAddressDto;
import org.order.executor.command.AbstractCommand;
import org.order.executor.command.CompanyAddressCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompanyAddressService{
@Autowired
private CommandGateway commandGateway;
public void CompanyAddress(CompanyAddressDto dto){
AbstractCommand command=new CompanyAddressCommand(dto);
commandGateway.sendAndWait(command);
}
}