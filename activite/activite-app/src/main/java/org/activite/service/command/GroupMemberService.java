package  org.activite.service.command;

import org.activite.dto.entity.GroupMemberDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.GroupMemberCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GroupMemberService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void GroupMember(GroupMemberDto dto){
AbstractCommand command=new GroupMemberCommand(dto);
commandGateway.sendAndWait(command);
}
}