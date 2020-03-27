package  org.product.service.command.entity;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.GiftAndProductRelationshipDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.GiftAndProductRelationshipCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class GiftAndProductRelationshipService{
@Autowired
private CommandGateway commandGateway;
public void GiftAndProductRelationship(GiftAndProductRelationshipDto dto){
AbstractCommand command=new GiftAndProductRelationshipCommand(dto);
commandGateway.sendAndWait(command);
}
}