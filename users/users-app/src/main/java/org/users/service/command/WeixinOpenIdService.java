package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.WeixinOpenIdCommand;

import org.springframework.stereotype.Service;
@Service
public class WeixinOpenIdService{
@Autowired
private CommandGateway commandGateway;
public void WeixinOpenId(WeixinOpenIdDto dto){
AbstractQuery command=new WeixinOpenIdCommand(dto);
commandGateway.sendAndWait(command);
}
}