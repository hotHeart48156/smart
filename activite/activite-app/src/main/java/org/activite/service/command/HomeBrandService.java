package  org.activite.service.command;

import org.activite.dto.entity.HomeBrandDto;
import org.activite.executor.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HomeBrandService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void HomeBrand(HomeBrandDto dto){
AbstractCommand command=new HomeBrandCommand(dto);
commandGateway.sendAndWait(command);
}
}