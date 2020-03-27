package  org.activite.service.command.redpacket;

import org.activite.dto.agg.redpacket.RedPacketStockDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.redpacket.RedPacketStockCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class RedPacketStockService{
@Autowired
private CommandGateway commandGateway;
public void RedPacketStock(RedPacketStockDto dto){
AbstractCommand command=new RedPacketStockCommand(dto);
commandGateway.sendAndWait(command);
}
}