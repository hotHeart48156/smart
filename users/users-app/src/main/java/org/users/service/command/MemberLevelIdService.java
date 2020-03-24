package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.MemberLevelIdDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.MemberLevelIdCommand;
@Service
public class MemberLevelIdService{
@Autowired
private CommandGateway commandGateway;
public void MemberLevelId(MemberLevelIdDto dto){
AbstractCommand command=new MemberLevelIdCommand(dto);
commandGateway.sendAndWait(command);
}
}