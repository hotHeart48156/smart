package  org.activite.service.command;

import org.activite.dto.entity.HomeNewProductDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.HomeNewProductCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HomeNewProductService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void HomeNewProduct(HomeNewProductDto dto){
AbstractCommand command=new HomeNewProductCommand(dto);
commandGateway.sendAndWait(command);
}
}