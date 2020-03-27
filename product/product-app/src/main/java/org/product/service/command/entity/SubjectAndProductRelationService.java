package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.SubjectAndProductRelationDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.SubjectAndProductRelationCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class SubjectAndProductRelationService{
@Autowired
private CommandGateway commandGateway;
public void SubjectAndProductRelation(SubjectAndProductRelationDto dto){
AbstractCommand command=new SubjectAndProductRelationCommand(dto);
commandGateway.sendAndWait(command);
}
}