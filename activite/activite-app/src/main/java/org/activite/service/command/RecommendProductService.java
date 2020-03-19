package  org.activite.service.command;

import org.activite.dto.entity.RecommendProductDto;
import org.activite.executor.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RecommendProductService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RecommendProduct(RecommendProductDto dto){
AbstractCommand command=new RecommendProductCommand(dto);
commandGateway.sendAndWait(command);
}
}