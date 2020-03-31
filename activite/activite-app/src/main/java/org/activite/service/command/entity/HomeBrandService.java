package  org.activite.service.command.entity;

import org.activite.dto.entity.HomeBrandDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.HomeBrandCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class HomeBrandService{
@Autowired
private CommandGateway commandGateway;
public void HomeBrand(HomeBrandDto dto){
AbstractCommand command=new HomeBrandCommand(dto);
commandGateway.sendAndWait(command);
}
}