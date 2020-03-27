package  org.activite.service.command.entity;

import org.activite.dto.entity.RecommendSubjectDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.RecommendSubjectCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RecommendSubjectService{
@Autowired
private CommandGateway commandGateway;
public void RecommendSubject(RecommendSubjectDto dto){
AbstractCommand command=new RecommendSubjectCommand(dto);
commandGateway.sendAndWait(command);
}
}