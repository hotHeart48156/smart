package  org.activite.service.command.entity;

import org.activite.dto.entity.RecommendProductDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.RecommendProductCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RecommendProductService{
@Autowired
private CommandGateway commandGateway;
public void RecommendProduct(RecommendProductDto dto){
AbstractCommand command=new RecommendProductCommand(dto);
commandGateway.sendAndWait(command);
}
}