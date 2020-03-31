package  org.activite.service.command.entity;

import org.activite.dto.entity.HomeNewProductDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.HomeNewProductCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class HomeNewProductService{
@Autowired
private CommandGateway commandGateway;
public void HomeNewProduct(HomeNewProductDto dto){
AbstractCommand command=new HomeNewProductCommand(dto);
commandGateway.sendAndWait(command);
}
}