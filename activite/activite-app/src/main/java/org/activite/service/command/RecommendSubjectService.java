package  org.activite.service.command;

import org.activite.dto.entity.RecommendSubjectDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RecommendSubjectCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RecommendSubjectService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RecommendSubject(RecommendSubjectDto dto){
AbstractCommand command=new RecommendSubjectCommand(dto);
commandGateway.sendAndWait(command);
}
}