package  org.product.commandservice;

import org.activite.executor.command.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.command.BrandNameCommand;
import org.product.dto.aggre.BrandNameDto;
import org.springframework.beans.factory.annotation.Autowired;
public class BrandNameService{
@Autowired
private CommandGateway commandGateway;
public void BrandName(BrandNameDto dto){
AbstractCommand command=new BrandNameCommand(dto);
commandGateway.sendAndWait(command);
}
}