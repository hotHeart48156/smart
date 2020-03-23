package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.MemberLevelIdCommand;

import org.springframework.stereotype.Service;
@Service
public class MemberLevelIdService{
@Autowired
private CommandGateway commandGateway;
public void MemberLevelId(MemberLevelIdDto dto){
AbstractQuery command=new MemberLevelIdCommand(dto);
commandGateway.sendAndWait(command);
}
}