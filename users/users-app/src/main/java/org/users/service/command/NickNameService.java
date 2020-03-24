package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.NickNameDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.NickNameCommand;
@Service
public class NickNameService{
@Autowired
private CommandGateway commandGateway;
public void NickName(NickNameDto dto){
AbstractCommand command=new NickNameCommand(dto);
commandGateway.sendAndWait(command);
}
}