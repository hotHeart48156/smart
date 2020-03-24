package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.PasswordDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.PasswordCommand;

@Service
public class PasswordService{
@Autowired
private CommandGateway commandGateway;
public void Password(PasswordDto dto){
AbstractCommand command=new PasswordCommand(dto);
commandGateway.sendAndWait(command);
}
}