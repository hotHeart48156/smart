package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.entity.TagDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.TagCommand;

@Service
public class TagService{
@Autowired
private CommandGateway commandGateway;
public void Tag(TagDto dto){
AbstractCommand command=new TagCommand(dto);
commandGateway.sendAndWait(command);
}
}