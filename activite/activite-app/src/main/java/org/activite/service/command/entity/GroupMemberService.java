package  org.activite.service.command.entity;

import org.activite.dto.entity.GroupMemberDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.entity.GroupMemberCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class GroupMemberService{
@Autowired
private CommandGateway commandGateway;
public void GroupMember(GroupMemberDto dto){
AbstractCommand command=new GroupMemberCommand(dto);
commandGateway.sendAndWait(command);
}
}