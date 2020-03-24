package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.dto.agg.WeixinOpenIdDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.WeixinOpenIdCommand;
@Service
public class WeixinOpenIdService{
@Autowired
private CommandGateway commandGateway;
public void WeixinOpenId(WeixinOpenIdDto dto){
AbstractCommand command=new WeixinOpenIdCommand(dto);
commandGateway.sendAndWait(command);
}
}