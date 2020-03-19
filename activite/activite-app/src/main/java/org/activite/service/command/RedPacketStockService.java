package  org.activite.service.command;

import org.activite.dto.agg.RedPacketStockDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.RedPacketStockCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class RedPacketStockService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketStock(RedPacketStockDto dto){
AbstractCommand command=new RedPacketStockCommand(dto);
commandGateway.sendAndWait(command);
}
}